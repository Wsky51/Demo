package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/28.
 */
public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)){
            return false;
        }
        Point point = (Point) obj;
        return (this.x==point.x)&&(this.y==point.y);
    }
}

