package com.demo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ligen
 * @title: ClassLoader
 * @projectName java
 * @description:
 * @date 2020/7/319:09
 */
public class Provider {

    public static void invoke() {
        ServiceLoader<InterfaceDemo> load = ServiceLoader.load(InterfaceDemo.class);

        Iterator<InterfaceDemo> iterator = load.iterator();

        while (iterator.hasNext()) {

            InterfaceDemo next = iterator.next();
            Class<? extends InterfaceDemo> aClass = next.getClass();
            System.out.println(aClass.getName());
            next.method1();
            next.method2();
            next.method3();
        }
    }

}
