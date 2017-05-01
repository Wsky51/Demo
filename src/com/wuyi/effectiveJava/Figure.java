package com.wuyi.effectiveJava;

import sun.security.provider.SHA;

import java.util.Map;

/**
 * Created by LENOVO on 2017/5/1.
 */
public class Figure1 {
    enum Shape{RECTANGLE,CIRCLE};
    final Shape shape;

    double length;
    double width;

    double radius;

    Figure1(double radius){
        shape=Shape.CIRCLE;
        this.radius=radius;
    }
    Figure1(double length,double width){
        shape=Shape.RECTANGLE;
        this.length=length;
        this.width=width;
    }
    double area(){
        switch (shape){
            case CIRCLE:
                return Math.PI*(radius*radius);
            case RECTANGLE:
                return length*width;
            default:throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Figure1 figure = new Figure1(1);
        System.out.println(figure.area());
    }
}
