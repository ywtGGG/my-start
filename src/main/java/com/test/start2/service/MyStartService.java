package com.test.start2.service;

public class MyStartService {
    private String name;
    private String msg;

    public MyStartService(String name,String msg){
        this.name = name;
        this.msg = msg;
    }

    public void say(){
        System.out.println(name + " say : "+msg);
    }
}
