package com.hspedu.static_;

public class VisitStatic {

    public static void main(String[] args) {
        //类变量是随着类的加载而创建的，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);

    }
}

class A {
    //类变量的访问，必须遵守相应的访问权限
    public static String name = "韩顺平教育";
}