package com.bri8.designPatterns;
public class SingletonDemo {
    public static void main(String[] args) {
    	
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
    }
}
