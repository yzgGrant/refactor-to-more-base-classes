package com.github.hcsp.inheritance;

public class 生物 {
    String name;

    public 生物(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
