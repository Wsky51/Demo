package com.wuyi.effectiveJava;

/**
 * Created by LENOVO on 2017/4/29.
 */
public final class PhoneNumber implements Cloneable,Comparable<PhoneNumber>{
    private  short areaCode;
    private  short prefix;
    private  short lineNumber;

    public short getPrefix() {
        return prefix;
    }

    public void setPrefix(short prefix) {
        this.prefix = prefix;
    }

    private PhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode= (short) areaCode;
        this.prefix= (short) prefix;
        this.lineNumber= (short) lineNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(!(obj instanceof PhoneNumber)){
            return false;
        }
        PhoneNumber p = (PhoneNumber) obj;
        return p.areaCode==areaCode&&p.prefix==prefix&&p.lineNumber==lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int res=areaCode-o.areaCode;
        if(res!=0){
            return res;
        }
        return 0;

    }

    @Override
    protected PhoneNumber clone() throws CloneNotSupportedException {
        return (PhoneNumber)super.clone();
    }

    @Override
    public int hashCode() {
        int result=17;
        result=31*result+areaCode;
        result=31*result+prefix;
        result=31*result+lineNumber;
        return result;
    }
    public void f(){
        System.out.println("areaCode"+areaCode);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneNumber p=new PhoneNumber(123,355,321);
        PhoneNumber clone = (PhoneNumber)p.clone();
        System.out.println(p.getClass()==clone.getClass());
        System.out.println(clone.prefix);
        clone.setPrefix((short) 366);
        System.out.println(clone.prefix);
        System.out.println(p.prefix);
        System.out.println(clone==p);

        clone.f();
    }
}
