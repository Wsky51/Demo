package com.wuyi.url;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LENOVO on 2017/4/25.
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap <String, Integer>();
        map.put("www.baidu.com",6);
        map.put("www.souhu.com",1);
        map.put("www.hao123",1);
        map.put("www.163.com",1);
        if(map.containsKey("www.baidu.com")){
            System.out.println("进入If语句");
            Integer integer = map.get("www.baidu.com");
            integer+=1;
            System.out.println(integer);
            map.put("www.baidu.com",integer);
        }
        System.out.println("现在里面的数目是"+map.get("www.baidu.com"));
    }
}
