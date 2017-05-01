package com.wuyi.effectiveJava;

import java.util.Date;

/**
 * Created by LENOVO on 2017/4/30.
 */
public class Sub extends Super{
    private final Date date;
    Sub(){
        date=new Date();
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub=new Sub();
        sub.overrideMe();
    }
}
