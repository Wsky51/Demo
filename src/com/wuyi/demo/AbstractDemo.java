package com.wuyi.demo;

/**
 * Created by LENOVO on 2017/4/28.
 */
public abstract class AbstractDemo {
    private String name;
    private String id;

    public static void main(String[] args) {
        System.out.println("你几号啊");
        AbstractDemo a=new AbstractDemo() {
            @Override
            public void f() {
                System.out.println("内部方法");
            }
        };
        a.f();
    }
    public abstract void f();

}
