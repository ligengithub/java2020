import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @author ligen
 * @title: ExportModal
 * @projectName java
 * @description:
 * @date 2020/9/2915:38
 */

public class ExportModal {

    @Excel(name = "数据", orderNum = "0")
    private String data;

    @Excel(name = "时间", orderNum = "1")
    private String date;

    @Excel(name = "备注", orderNum = "2")
    private String remark;


    @Excel(name = "温度", orderNum = "3")
    private String temp;

    @Excel(name = "湿度", orderNum = "4")
    private String humi;

    @Excel(name = "RSRP", orderNum = "5")
    private String rsrp;
    @Excel(name = "SNR", orderNum = "6")
    private String snr;
    @Excel(name = "ECL", orderNum = "7")
    private String ecl;
    @Excel(name = "RSRQ", orderNum = "8")
    private String rsrq;

    public ExportModal() {
    }

    public ExportModal(String data, String date) {
        this.data = data;
        this.date = date;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumi() {
        return humi;
    }

    public void setHumi(String humi) {
        this.humi = humi;
    }

    public String getRsrp() {
        return rsrp;
    }

    public void setRsrp(String rsrp) {
        this.rsrp = rsrp;
    }

    public String getSnr() {
        return snr;
    }

    public void setSnr(String snr) {
        this.snr = snr;
    }

    public String getEcl() {
        return ecl;
    }

    public void setEcl(String ecl) {
        this.ecl = ecl;
    }

    public String getRsrq() {
        return rsrq;
    }

    public void setRsrq(String rsrq) {
        this.rsrq = rsrq;
    }

    @Override
    public String toString() {
        return "ExportModal{" +
                "data='" + data + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
