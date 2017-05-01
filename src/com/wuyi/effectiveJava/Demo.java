package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/30.
 */
interface asas{
    int asasdemo=3;
}
class Demo  implements asas{
    public static void main(String[] args) {
        System.out.println(asasdemo);
    }
}

abstract class Figure{
    abstract double area();
}
class Circle extends Figure{
    final double radius;

    Circle(double radius){this.radius=radius;}
    double area(){return Math.PI*(radius*radius);}
}
class Rectangle extends Figure{
    final double length;
    final double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area() {
        return length*width;
    }
}







