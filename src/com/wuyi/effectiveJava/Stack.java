package com.wuyi.effectiveJava;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Map;

/**
 * Created by LENOVO on 2017/4/28.
 */
public class Stack implements Cloneable{
    private  Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;
    public Stack(){
        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }


    @Override
    protected Stack clone() throws CloneNotSupportedException {
        return (Stack)super.clone();
    }

    public Object pop(){
        if(size==0){
            throw new EmptyStackException();
        }
        elements[size]=null;
        return elements[--size];

    }
    private void ensureCapacity(){
        if(elements.length==size){
            elements=Arrays.copyOf(elements,2*size+1);
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        for(int i=0;i<12;i++){
            stack.push(i);
        }
        try {
            Stack clone = stack.clone();
            System.out.println(stack.size);
            System.out.println(clone.size);
            System.out.println(clone==stack);
            System.out.println(stack.pop());
            System.out.println(clone.pop());
            System.out.println(clone.hashCode());
            System.out.println(stack.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
