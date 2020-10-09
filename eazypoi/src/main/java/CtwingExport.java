import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author ligen
 * @title: TestPOI
 * @projectName java
 * @description:
 * @date 2020/9/299:57
 */
public class CtwingExport {


    public static void main(String[] args) throws IOException {

        final ArrayList<ExportModal> beforeFilter = new ArrayList<ExportModal>(200);
        ArrayList<ExportModal> afterFilter = new ArrayList<ExportModal>(200);

        String json = getJson();

        JSONObject jsonObject = JSONObject.parseObject(json);
        String dataArray = jsonObject.get("RECORDS").toString();
        JSONArray objects = JSON.parseArray(dataArray);


        for (int i = 0; i < objects.size(); i++) {
            JSONObject jsonObj = JSONObject.parseObject(objects.get(i).toString());
            String data = jsonObj.getString("data");
            String create_time = jsonObj.getString("create_time");

//            String data2 = "{\"notifyType\":\"deviceDatasChanged\",\"requestId\":null,\"deviceId\":\"b23bfeaa-d46d-4151-85fc-3fc886b8f51d\",\"gatewayId\":\"b23bfeaa-d46d-4151-85fc-3fc886b8f51d\"}";


            CtwingModule module = JSON.parseObject(data, CtwingModule.class);
            final Date date = new Date((long) Long.valueOf(create_time) * 1000);


//        byte[] bytes = EncodeUtils.decodeHex(module.getPayload().getAPPdata());
            byte[] bytes = EncodeUtils.decodeBase64(module.getPayload().getAPPdata());

            final String hexString = EncodeUtils.encodeHex(bytes);

            final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            beforeFilter.add(new ExportModal() {{
                setData(hexString);
                setDate(format.format(date));
            }});

        }

        System.out.println(beforeFilter.size());

        // json 已经全部转化成Object
        for (int i = 0; i < beforeFilter.size(); i++) {
            String data = beforeFilter.get(i).getData();

            if (data.length() < 104) {
                continue;
            }

            String cmdFlag = data.substring(92, 94);
            String eventFlag = data.substring(94, 96);


//            FAD10003004000095F728668383639373638303431373931383333FFFF8000FFFF800002FFFF80000672E952FFFF05004A000B015F728668003A26013900D2FB


            if (StringUtils.equals(cmdFlag, "05") || StringUtils.equals(eventFlag, "05")) {
                ExportModal exportModal = new ExportModal(beforeFilter.get(i).getData(), beforeFilter.get(i).getDate());

                if (!"00".equals(data.substring(102, 104))) {

                    // 温度
                    String lowTmp = data.substring(116, 118);
                    String hTmp = data.substring(118, 120);
                    String tmpHex = hTmp + lowTmp;
                    BigInteger i1 = new BigInteger(tmpHex, 16);
                    String temp = String.valueOf((double) i1.longValue() / 100L);

                    // 湿度
                    String lowHum = data.substring(120, 122);
                    String hHum = data.substring(122, 124);
                    String tmpHum = hHum + lowHum;
                    BigInteger hum = new BigInteger(tmpHum, 16);
                    String sHum = hum.toString();

                    // rsrp
                    String rsrp = "ffffffff" + data.substring(58, 62);
                    Integer Irsrp = new BigInteger(rsrp, 16).intValue();
                    String sRsrp = Irsrp.toString();

                    // snr
                    String snr =  data.substring(66, 70);
                    Integer iSnr = new BigInteger(snr, 16).intValue();
                    String sSnr = iSnr.toString();

                    // ecl
                    String ecl = data.substring(70, 72);
                    Integer iecl = new BigInteger(ecl, 16).intValue();
                    String secl = iecl.toString();

                    // rsrq
                    String rsrq = "ffffffff" + data.substring(76, 80);
                    Integer irsrq = new BigInteger(rsrq, 16).intValue();
                    String srsrq = irsrq.toString();

                    exportModal.setTemp(temp);
                    exportModal.setHumi(sHum);
                    exportModal.setEcl(secl);
                    exportModal.setRsrp(sRsrp);
                    exportModal.setRsrq(srsrq);
                    exportModal.setSnr(sSnr);
                }


                if (StringUtils.equals(eventFlag, "05")) {
                    exportModal.setRemark("温湿度告警");
                }

                afterFilter.add(exportModal);
            }
        }


        //
        System.out.println("过滤前数据个数" + beforeFilter.size());
        System.out.println("过滤后数据个数" + afterFilter.size());
        for (ExportModal exportModal : afterFilter) {
            System.out.println(exportModal);
        }


        ExportParams exportParams = new ExportParams("温湿度上报数据导出", "温湿度上报数据导出", ExcelType.XSSF);

        Workbook sheets = ExcelExportUtil.exportBigExcel(exportParams, ExportModal.class, afterFilter);

        FileOutputStream fos = new FileOutputStream(".\\eazypoi\\ctwing温湿度数据上报导出.xlsx");

        sheets.write(fos);

    }


    //获取json
    public static String getJson() throws UnsupportedEncodingException {
        String jsonStr = "";
        try {
            String path = CtwingExport.class.getClassLoader().getResource("outer_report.json").getPath();
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            Reader reader = new InputStreamReader(new FileInputStream(file), "Utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    private static final long parseUnsignedLong(String str) {
        BigDecimal data = new BigDecimal(str);
        long l = data.subtract(new BigDecimal(Long.MAX_VALUE)).subtract(BigDecimal.valueOf(1)).longValue();
        return l | Long.MIN_VALUE;
    }

}


