package com.wuyi.demo;

import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by LENOVO on 2017/4/27.
 */

enum Demo{
    demoS1,demoS2,demoS3,demoS4;
}
public class EnumDemo {
    public static void main(String[] args) {
        ExecutorService e= Executors.newCachedThreadPool();
    }
}
