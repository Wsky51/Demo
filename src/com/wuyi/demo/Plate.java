package com.wuyi.demo;

import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by LENOVO on 2017/4/27.
 */
class Fruit{

}
class Apple extends Fruit{

}

public class Plate <T> {
    private T item;
    public Plate(T t){
        item=t;
    }
    public void set(T t){
        item=t;
    }
    public T get(){
        return item;
    }

    public static void main(String[] args) {
        Plate<? extends Fruit> p=new Plate <Apple>(new Apple());
        String a="dsadadadsafv";
        int [] list={1,2,4,6,3,6,10,3,54,4};
        System.out.println(Arrays.toString(list));
        InputStream in = System.in;
    }


}
