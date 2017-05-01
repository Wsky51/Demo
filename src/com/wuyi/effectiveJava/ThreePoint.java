package com.wuyi.effectiveJava;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by LENOVO on 2017/4/28.
 */
public class ThreePoint{
    private final Point point;
    private final int z;
    public ThreePoint(int x,int y,int z){
        point=new Point(x,y);
        this.z=z;
    }
    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        if(!(obj instanceof ThreePoint)){
            return false;
        }
        ThreePoint threePoint = (ThreePoint) obj;

        return threePoint.point.equals(point)&&threePoint.z==z;
    }

    public static void main(String[] args) {
        float f=1032.32132f;
        System.out.println(f);
        int i = Float.floatToIntBits(f);
        System.out.println(Float.floatToIntBits(f));
    }
}

