package com.wuyi.url;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LENOVO on 2017/4/25.
 */
public class CountFileUrl {

    public static void main(String[] args) {
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader("E:\\TestData\\UrlDictionary\\url1.txt"));
            BufferedReader bf2 = new BufferedReader(new FileReader("E:\\TestData\\UrlDictionary\\url2.txt"));
            String line;
            Map <String, Integer> map1 = new HashMap <String, Integer>();
            Map <String, Integer> map2 = new HashMap <String, Integer>();
            Map <String, Integer> targetMap = new HashMap <String, Integer>();
            while ((line = bf1.readLine()) != null) {
                if (!map1.containsKey(line)) {
                    map1.put(line, 1);
                } else {
                    Integer count = map1.get(line);
                    map1.put(line, ++count);
                }
            }
            while ((line = bf2.readLine()) != null) {
                if (!map2.containsKey(line)) {
                    map2.put(line, 1);
                } else {
                    Integer count = map2.get(line);
                    map2.put(line, ++count);
                }
                if (map1.containsKey(line)) {
                    targetMap.put(line, (map1.get(line) + map2.get(line)));
                }
            }

            System.out.println(map1);
            System.out.println(map2);
            System.out.println("结果如下：");
            System.out.println(targetMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
