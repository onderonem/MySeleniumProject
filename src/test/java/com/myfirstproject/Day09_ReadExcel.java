package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Day09_ReadExcel  {

    /*
     Import the apache poi dependency in your pom file
     Create resources directory under java folder
     (right click on java and create the folder)
     Add the Excel file on the "Resources" folder
     Create a new package: excelAutomation
     Create a new class : ReadExcel
     Create a new test method : readExcel()
     Store the path of the  file in a string
     */

    @Test
    public void readExcel() throws IOException {
        String path = "src/test/java/resources/Capitals.xlsx";

        // Open the file
        // We use FileInputStream file for working with file. It comes from Java.
        FileInputStream  fileInputStream = new  FileInputStream(path);

        // Open the workbook using FileInputStream
        Workbook workbook= WorkbookFactory.create(fileInputStream);


        // Open the first worksheet
        // Sheet sheet1= workbook.getSheetAt(0);  or
        Sheet sheet1= workbook.getSheet("Sheet1");


        // Go to first row
        Row row1=sheet1.getRow(0);


        // Go to first cell on that first row and print
        Cell cell1=row1.getCell(0);
        System.out.println(cell1);


        /*Cell objects can be converted to a string easily
         We may need to convert to a string if we need to manipulate the data
         such as lowercase, charAt, length,..*/
        System.out.println(cell1.toString().toLowerCase());


        // Go to second cell on that first row and print
        Cell cell2 =row1.getCell(1);
        System.out.println(cell2);
        // it returns cell data type, not string
        // row1 object represents row(0)

        String cellTwo=sheet1.getRow(1).getCell(1).toString();
        System.out.println(cellTwo);  // D.C

        // Go to 2nd row first cell, and assert if the data equals to the USA
        String r2C1 = sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals("USA",r2C1);


        // Go to 3rd row 2nd cell-chain the row and cell
        String r3C2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(r3C2);


        // Find the number of row
        int numberOfRow = sheet1.getLastRowNum()+1;
        System.out.println(numberOfRow );
        // getLastRowNum() index starts 0.It counts empty rows before the last row as well.


        // Find the number of used row
        int numberOfRowUsed = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfRowUsed);
        // getPhysicalNumberOfRows() index starts 1. It does not count empty rows.



        // Print country, capitol key value pairs as map object
//        Print country, capitol key value pairs as map object
//        {USA=D.C,France=Paris,England=London,...}
        Map<String,String> countryCapitals = new HashMap<>();
        for (int rowNumber = 1; rowNumber<numberOfRow ; rowNumber++) {
            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
//            System.out.println(countries);
            String capitals= sheet1.getRow(rowNumber).getCell(1).toString();
//            System.out.println(capitals);
            countryCapitals.put(countries,capitals);
        }
        System.out.println(countryCapitals);
    }
}
