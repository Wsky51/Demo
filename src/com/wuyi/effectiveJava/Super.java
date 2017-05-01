package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/30.
 */
public class Super {
    public Super(){
        overrideMe();
    }
    public void overrideMe(){
        System.out.println("Super()");
    }
}
