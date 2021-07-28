package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {
        String path="SampleData.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);

        workbook=new XSSFWorkbook(fileInputStream);
        sheet=workbook.getSheet("Employees");


//        row=sheet.getRow(1);
//        cell= row.createCell(1);


        XSSFCell adamsCell=sheet.getRow(2).getCell(0);

        adamsCell.setCellValue("Madam");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);



        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {

            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
                sheet.getRow(rowNum).getCell(0).setCellValue("Tom");
            }

        }

fileInputStream.close();
fileOutputStream.close();
workbook.close();


    }
}
