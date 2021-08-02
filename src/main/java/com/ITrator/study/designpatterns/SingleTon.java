package com.ITrator.study.designpatterns;

import java.io.Serializable;

public class SingleTon implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private SingleTon() {
        // private constructor
    }
 
    private static class DemoSingletonHolder {
        public static final SingleTon INSTANCE = new SingleTon();
    }
 
    public static SingleTon getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
}