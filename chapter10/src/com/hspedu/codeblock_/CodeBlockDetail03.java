package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {

    public AAA() {
        System.out.println("AAA构造器被调用");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块被调用");
    }
    public BBB() {
        //super()
        System.out.println("BBB构造器被调用");
    }
}