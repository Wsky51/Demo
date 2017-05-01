package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/30.
 */
public class Complex {
    private final double re;
    private final double im;
    private Complex(double re,double im){
        this.re=re;
        this.im=im;
    }
    public static Complex valueOf(double re,double im){
        return new Complex(re,im);
    }

    public static void main(String[] args) {

    }
}
