package com.automation.java_collections_optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class LinesFromTheFile {


    public static void ReversLines() throws Exception {

        ArrayList<String> stringArrayList = new ArrayList<>();

        try (BufferedReader buff = new BufferedReader(new FileReader("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\Snark.txt"))) {
            while (buff.ready()) {
                stringArrayList.add(buff.readLine());
            }
            for (String s : stringArrayList) {
                System.out.println(s);
            }

        } catch (IOException exception) {

        }
        System.out.println("\n");


        try(FileWriter writer = new FileWriter("C:\\NewJava\\NewJava\\src\\main\\java\\com\\automation\\java_collections_optional\\Krans.txt", false))
        {
            for (String s : stringArrayList) {
                String reverse = new StringBuffer(s).reverse().toString();
                System.out.println(reverse);
                writer.write((reverse) + "\n");
            }

            writer.flush();
        } catch(IOException exception){

        }
        System.out.println("\n");
    }

}




