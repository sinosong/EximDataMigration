package com.brilliance.util;

import com.brilliance.pojo.ZXPojo;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用POI,进行excel相关的操作
 *
 */
public class CreateExcelUtil {

    /**
     * 生成excel
     * @param downloadFlag //是否下载  如果下载传true 否 传false
     * @param titleS	   //标题的文字数组
     * @param centerVal	   //内容的二维数组
     * @return
     */
    public static byte[] createUserExcel(boolean downloadFlag,String[] titleS,String[][] centerVal) {
        try {
            if(titleS != null && titleS.length > 0 && centerVal != null && centerVal.length > 0){
                float mus =65536; //65536
                float avg = centerVal.length / mus;
                int width = 20;
                // 第一步，创建一个webbook，对应一个Excel文件
                XSSFWorkbook wb = new XSSFWorkbook();
                //title设置样式
                XSSFCellStyle titleStyle = wb.createCellStyle();
//                titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER); //居中格式
                titleStyle.setWrapText(true);//自动换行
                //页面设置样式
                XSSFCellStyle centerStyle = wb.createCellStyle();
                centerStyle.setWrapText(true);//自动换行
//                centerStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);//垂直居中
                //当前循环数
                int centerNum = 0;
                for(int sheetNum = 0; sheetNum < avg ; sheetNum++){
                    // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
                    XSSFSheet sheet= wb.createSheet("sheet1" + sheetNum);
                    //设置默认列宽
                    // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
                    XSSFRow row = sheet.createRow(0);
                    for(int i = 0; i < titleS.length; i++){
                        //设置列宽
                        sheet.setColumnWidth(i, 252*width+323);
                        //创建标题
                        XSSFCell cell  = row.createCell(i);
                        cell.setCellValue(titleS[i]);
                        cell.setCellStyle(titleStyle);
                    }
                    int iNum = 0;
                    if(centerVal.length > mus * (sheetNum+1)){
                        iNum =  (int)mus;
                    }else{
                        iNum = centerVal.length - (int)mus*sheetNum;
                    }
                    for(int i = 0 ; i < iNum  ; i++){
                        row = sheet.createRow(i + 1);
                        for(int j = 0; j < centerVal[centerNum].length; j++){
                            XSSFCell cell  = row.createCell(j);
                            cell.setCellValue(centerVal[centerNum][j]);
                            cell.setCellStyle(centerStyle);
                        }
                        centerNum ++;
                    }
                }
                if(downloadFlag){
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    wb.write(os);
                    byte[] bytes = os.toByteArray();
                    os.close();
                    return bytes;
                }else{
                    FileOutputStream fout = new FileOutputStream("D:/zx.xlsx");
                    wb.write(fout);
                    fout.close();
                    return null;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            // 清理资源
        }
        return null;
    }


    public static void main(String[] args) {
        String[] titles= {"债项编号","产品名称"};
        List<ZXPojo> zxlist = new ArrayList<ZXPojo>();
        zxlist.add(new ZXPojo("2018001","产品A"));
        zxlist.add(new ZXPojo("2018002","产品B"));
        zxlist.add(new ZXPojo("2018003","产品C"));
        zxlist.add(new ZXPojo("2018004","产品A"));
        String[][] centerVal = new String[zxlist.size()][2];

        for (int i = 0; i < zxlist.size(); i++) {
            ZXPojo zx = zxlist.get(i);
            centerVal[i][0] = (zx.getDeptcode() == null || "".equals(zx.getDeptcode()))  ? "-":zx.getDeptcode();
            centerVal[i][1] = (zx.getProductname() == null  || "".equals(zx.getProductname())) ? "-":zx.getProductname();
        }
        createUserExcel(false,titles,centerVal);
    }

    /**
     * 大文件读取
     * @param filepath
     */
    public static void readFromFile(String filepath){

        try {
            File file = new File(filepath);
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis,"utf-8"),5*1024*1024);// 用5M的缓冲读取文本文件

            String line = "";
            while((line = reader.readLine()) != null){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

