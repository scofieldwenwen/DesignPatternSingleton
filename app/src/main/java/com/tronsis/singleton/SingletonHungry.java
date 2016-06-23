package com.tronsis.singleton;

/**
 * @author scofield@tronsis.com
 * @date 2016/6/23 17:32
 * 单例--饿汉式:直接初始化
 * 在多线程的情况下，「饿汉式」不会出现问题,因为JVM只会加载一次单例类
 */
public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singleton;
    }
}
