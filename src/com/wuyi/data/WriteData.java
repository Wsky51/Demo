package com.wuyi.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LENOVO on 2017/4/20.
 */
public class WriteData {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            String fileName="Data"+i+".txt";
            System.out.println(fileName);
            try {
                PrintWriter pw=new PrintWriter(new FileWriter("E:\\TestData\\"+fileName));
                for(int j=i;j<100000000;j=j+100){
                    pw.println(j);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
