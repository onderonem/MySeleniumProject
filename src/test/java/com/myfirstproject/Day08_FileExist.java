
package com.myfirstproject;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Day08_FileExist {
    @Test
    public void isExistTest(){
//        Pick a file on your desktop
//        My file: logo.jpeg on the desktop
//        I will check if the file exist

        System.out.println(System.getProperty("user.dir"));
        //  C:\Users\drond\IdeaProjects\myseleniumproject
        String homeDirectory = System.getProperty("user.home");
        System.out.println(homeDirectory);
        // C:\Users\drond


//        WINDOWS EXAMPLE : C:\Users\Acer
//        MAC EXAMPLE : /Users/techproed
//     Path of the image
//        String pathOfFile = homeDirectory+"/Desktop/logo.jpeg";
        String pathOfFile = homeDirectory+"C:\\Users\\drond\\Downloads";   //Windows
        System.out.println(pathOfFile);
        // C:\Users\drond\Desktop\logo.jpeg
//        And verify if that file exist on your computer or not
        boolean isFileExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isFileExist);//Pass is exist, Fail is not exist
    }
    @Test
    public void secondWay(){
        String filePath ="C:\\Users\\drond\\Downloads";
        boolean isFileExist = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isFileExist);

       

    }
}