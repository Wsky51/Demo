package com.wuyi.demo;

/**
 * Created by LENOVO on 2017/4/27.
 */
public enum SpaceShip {
    DemoS1,demoS2,demoS3,demoS4;

    @Override
    public String toString() {
        String id=name();
        String lower=id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for(SpaceShip d:values()){
            System.out.println(d);

        }
    }
}
