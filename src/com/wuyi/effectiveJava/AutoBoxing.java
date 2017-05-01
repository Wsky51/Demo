package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/28.
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Long sum=0L;
        for(long i=0;i<10;i++){
            sum+=i;
            System.out.println(sum.getClass());
        }
    }
}
