package com.tronsis.singleton;

/**
 * @author scofield@tronsis.com
 * @date 2016/6/23 18:09
 * 枚举 线程安全
 */
public enum SingletonEnum {
    //定义一个枚举的元素，它就是Singleton的一个实例
    instance;

    public void doSomething() {
        //do something
    }

}
