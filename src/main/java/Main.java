package main.java;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        //Old Way
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java"); // Check java file
//            }
//        };
        //Lambda Expression (Java 8)
        FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("d:/Visual_Studio_Code/Udemy/Java8Masterclass/file"); // D:\Visual_Studio_Code\Udemy\Java8Masterclass\file
        File[] javaFiles = dir.listFiles(fileFilter);
        for(File file : javaFiles){
            System.out.println("File name: " + file.getName());
        }
    }
}
