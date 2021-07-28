package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path="SampleData.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);


        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);


        XSSFSheet sheet=workbook.getSheet("Employees");


        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));
//Return the count of used cells only
        //If there are cells not used, they will not be counted
        //It will not count empty rows or cells
        //Starts counting from 1
        int usedRows=sheet.getPhysicalNumberOfRows();


        //Returns the number from the top cell to button cell
        //It does not care if there are empty cells or not
        // Starts counting from 0
        int lastUsedRow=sheet.getLastRowNum();

        //TODO: 1 -CREAT A LOGIC TO PRINT OUT NEENAS NAME DYNAMICALLY


        for (int i = 1; i < usedRows; i++) {
                if(sheet.getRow(i).getCell(0).toString().equals("Neena")){
                    System.out.println("found");

                }

        }






    }
}