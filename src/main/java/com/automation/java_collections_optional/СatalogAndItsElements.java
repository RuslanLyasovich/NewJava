package com.automation.java_collections_optional;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class СatalogAndItsElements<structure> {


    public static void CreateStructure() {

        new File("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\ParentDir\\MidlDir\\JunDir").mkdirs();


        try {
            File filePar = new File("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\ParentDir\\song.text");
            filePar.createNewFile();

            File fileMidl = new File("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\ParentDir\\MidlDir\\poem.text");
            fileMidl.createNewFile();

            File file = new File("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\ParentDir\\MidlDir\\JunDir\\anthem.text");
            file.createNewFile();

        } catch (Exception exception) {
            System.err.println(exception);
        }


        File file = new File("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation");
        File[] fileList = file.listFiles();
        System.out.println(fileList.toString());


    }
}


