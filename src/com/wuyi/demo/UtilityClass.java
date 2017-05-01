package com.wuyi.demo;
/**
 * Created by LENOVO on 2017/4/28.
 */
public class UtilityClass {
    private UtilityClass(){
        throw new AssertionError();
    }

    public static void main(String[] args) {
        Boolean aTrue = Boolean.valueOf("adsa");
        System.out.println(aTrue);
    }
}
