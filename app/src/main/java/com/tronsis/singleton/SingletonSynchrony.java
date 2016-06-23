package com.tronsis.singleton;

/**
 * @author scofield@tronsis.com
 * @date 2016/6/23 17:47
 * 懒汉式同步 双重校验锁
 */
public class SingletonSynchrony {
private static SingletonSynchrony instance = null;

    private SingletonSynchrony(){}

    public static SingletonSynchrony getInstance(){
        if (instance==null){
            synchronized (SingletonSynchrony.class){
                if (instance == null){
                    instance = new SingletonSynchrony();
                }
            }
        }
        return instance;
    }

}
