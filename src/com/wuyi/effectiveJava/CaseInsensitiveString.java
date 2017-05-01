package com.wuyi.effectiveJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 2017/4/29.
 */
public class CaseInsensitiveString{
    private final String s;
    public CaseInsensitiveString(String s){
        if(s==null){
            throw new NullPointerException();
        }
        this.s=s;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof CaseInsensitiveString)&&((((CaseInsensitiveString) obj).s.equalsIgnoreCase(s)));
    }
    public static void main(String[] args) {
        CaseInsensitiveString cis=new CaseInsensitiveString("Polish");
        String s="polish";
        List<CaseInsensitiveString> list=new ArrayList <CaseInsensitiveString>();
        list.add(cis);
        System.out.println(list.contains(s));
        List<String> slist=new ArrayList <String>();
        slist.add(s);
        System.out.println(slist.contains(cis));

    }
}
