package com.wuyi.data;

import java.io.*;
//"E:\\TestData\\Data1.txt"
/**
 * Created by LENOVO on 2017/4/20.
 */
public class Demo {
    //将测试数据写入到本地电脑E盘，该函数最好只运行一次
    public static void writeTestData(){
        for(int i=1;i<=100;i++) {
            String fileName = "Data" + i + ".txt";
            try {
                PrintWriter pw=new PrintWriter(new FileWriter("E:\\TestData\\"+fileName));;
                for(int j=i;j<100000000;j=j+100){
                    pw.println(j);
                }
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //返回txt文件的第一行
    public static int getFirstData(String fileName){
        try {
            BufferedReader bf=new BufferedReader(new FileReader(fileName));
            String firstLine=bf.readLine();
            bf.close();
            return Integer.parseInt(firstLine);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    //txt文件删除第一行
    public static void deleteFirstLine(String fileName){
        int lineDel=1;
        int linenum=0;
        try {
            BufferedReader bf=new BufferedReader(new FileReader(fileName));
            PrintWriter pw=new PrintWriter(new FileWriter("E:\\TestData\\temp.txt"));
            String line;
            while((line=bf.readLine())!=null){
                linenum++;
                if(linenum==lineDel){
                    continue;
                }
                pw.println(line);
            }
            bf.close();
            pw.close();
            File dataFile=new File(fileName);
            dataFile.delete();
            File newName=new File(fileName);
            File f=new File("E:\\TestData\\temp.txt");
            f.renameTo(newName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    //返回100个文件里第一个数值经过比较后的最小值,找到该最小的数据之后，重写入其他行里面去
    public static int getMinFisrtNumInTotal100File(){
        int minNum=getFirstData("E:\\TestData\\Data1.txt");
//        System.out.println(minNum);
        int firstData=0;
        String targetFile="E:\\TestData\\Data1.txt";
        for(int i=1;i<=100;i++){
            String fileName = "Data" + i + ".txt";
            firstData=getFirstData("E:\\TestData\\"+fileName);
//            System.out.println("现在进入"+fileName+"查找，此时minNum的值是"+minNum+"firstData的值是"+firstData);
            if(firstData<minNum){
                minNum=firstData;
                targetFile="E:\\TestData\\"+fileName;
//                System.out.println(minNum);
            }
        }
        System.out.println(targetFile);
        deleteFirstLine(targetFile);
        return minNum;
    }
    //进行数据和合并整理，但是此处注意，运行的时候会删除原来的数据文件，所以要提前对数据进行保留，否则造成数据的丢失
    public static void conbineData(int length){
        try {
            PrintWriter pw=new PrintWriter(new FileWriter("E:\\TestData\\DataConbine.txt"));
                for(int j=0;j<length;j++){
                    int maxNum = getMinFisrtNumInTotal100File();
                    pw.println(maxNum);
                }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        conbineData(200);
    }
}
