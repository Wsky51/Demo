package com.wuyi.effectiveJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by LENOVO on 2017/4/30.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount;
    public InstrumentedHashSet(){}
    public InstrumentedHashSet(int initCap,float loadFactor){
        super(initCap,loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount+=c.size();
        return super.addAll(c);
    }
    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s=new InstrumentedHashSet <String>();
        s.addAll(Arrays.asList("t1","t2","t3"));
        System.out.println(s.getAddCount());
    }
}
