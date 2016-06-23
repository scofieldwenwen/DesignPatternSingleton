package com.tronsis.singleton;

/**
 * @author scofield@tronsis.com
 * @date 2016/6/23 17:36
 * 懒汉式:用时才初始化
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

}
