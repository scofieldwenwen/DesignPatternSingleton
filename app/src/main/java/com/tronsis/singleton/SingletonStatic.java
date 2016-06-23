package com.tronsis.singleton;

/**
 * @author scofield@tronsis.com
 * @date 2016/6/23 17:59
 * 线程安全
 * 采用内部类，在这个内部类里面去创建对象实例
 */
public class SingletonStatic {
    private static class SingletonHolder {
        public static SingletonStatic singleStatic = new SingletonStatic();
    }

    private SingletonStatic(){}

    public  static SingletonStatic getInstance(){
        return SingletonHolder.singleStatic;
    }


    public void doSomething(){
        //do something
    }
}
