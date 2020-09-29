import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author ligen
 * @title: FilewithExcelUtil
 * @projectName java
 * @description:
 * @date 2020/9/2916:17
 */
public class FilewithExcelUtil {

    public static void creatExcel(List<?> list, String title, String sheetName, Class<?> pojoClass, String fileName,
                                  String directory) throws IOException {
        ExportParams exportParams = new ExportParams(title, sheetName);
        exportParams.setHeaderHeight((double) 100);
//        exportParams.setStyle(PoiExportStyle.class);
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);
        if (workbook != null) ;
        {
            //将Excel文件放到本地路径下
            if (directory == null) {
                directory = "C:\\Users\\xx\\Desktop"; // 本地目录
            }
            FileOutputStream os = new FileOutputStream(directory + fileName);
            workbook.write(os);
            os.close();
        }
    }
}
