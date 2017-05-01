package com.wuyi.demo;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by LENOVO on 2017/4/28.
 */

public class Elvis{
//    public static final Elvis INSTANCE=new Elvis();
//    private Elvis(){}
    private static final Elvis INSTACE=new Elvis();
    private Elvis(){
        System.out.println("实例化了");
    }
    public static Elvis getInstace(){
        return INSTACE;
    }
}
