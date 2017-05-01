package com.wuyi.demo;

import java.util.ArrayList;

/**
 * Created by LENOVO on 2017/4/27.
 */
public class IntegerMatch {
    public static void main(String[] args) {
        Class class1 = new ArrayList <String>().getClass();
        Class class2 =new ArrayList<Integer>().getClass();
        System.out.println(class1==class2);
    }
}
