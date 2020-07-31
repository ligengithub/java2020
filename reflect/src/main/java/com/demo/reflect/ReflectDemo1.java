package com.demo.reflect;

import com.demo.reflect.entry.People;
import com.demo.reflect.face.InterfaceA;
import com.demo.reflect.face.IntetfaceImpl1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ligen
 * @title: ReflectDemo1
 * @projectName reflect
 * @description:
 * @date 2020/2/2415:58
 */
public class ReflectDemo1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

//        testA();

        testB();

    }

    /**
     * @ desc : 常用方法
     */
    public static void testA() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        // 方式1 建立对象
        People people = new People();
        Class class1 = people.getClass();

//        // 方式2  全类名
//        Class<?> class2 = Class.forName("com.spi.reflect.entry.People");
//
//
//        // 方式3  类
//        Class class3 = People.class;


        // 方法 1 通过class 实例化对象，注意:  实例化对象会使用 类的 空参构造器 进行实例化对象
        People people1 = (People) class1.newInstance();
        System.out.println(people1);

        // 方法 2  获取全类名
        String name = class1.getName();
        System.out.println(name);

        // 方法3  获取属性列表
        Field[] declaredFields = class1.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i]);
        }

        // 方法4  获取空参构造器
        Constructor declaredConstructor = class1.getDeclaredConstructor();
        System.out.println(declaredConstructor);

        // 多个参数 获取带参数的构造器
        Constructor anInt = class1.getConstructor(String.class, Integer.class);
        System.out.println(anInt);

        // 获取到构造器之后 可以使用new instance(...参数) 方式实例化对象

        // 获取方法
        Method methodName = class1.getDeclaredMethod("methodName", String.class);
    }


    /**
     * @说明: 测试反射调用方法
     *
     *     通过反射可以调用任意一个类的任何一个方法  包括
     *     public  protected  private
     */

    public static void testB() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        IntetfaceImpl1 impl = new IntetfaceImpl1();

        callHiddenMethod(impl,"method1");
        callHiddenMethod(impl,"method2");
        callHiddenMethod(impl,"method3");
    }

    static void callHiddenMethod(Object impl,String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> aClass = impl.getClass();
        Method method = aClass.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(impl);
    }


}
