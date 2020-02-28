package com.demo.genericity.geninterface;

/**
 * @author ligen
 * @title: MainDemo
 * @projectName genericity
 * @description:
 * @date 2020/2/2515:21
 */
public class MainDemo {

    public static void main(String[] args) {

        // 泛型接口的实现类 指定类型，这样可以让方法只传入指定类型
        GenericityInterfaceImpl face = new GenericityInterfaceImpl();
        Integer data = face.method(2);
        System.out.println(data);


        // 泛型接口的实现类不指定类型，默认为Object类型
        GenericityInterfaceImpl2 face2 = new GenericityInterfaceImpl2();
        Object data1 = face2.method(3);
        System.out.println(data1);

        // 泛型接口的实现类也是未知类型
        // 可以用来实例化不同的类
        GenericityInterfaceImpl3<Entry1> face3 = new GenericityInterfaceImpl3<Entry1>();
        Entry1 entry1 = face3.method(new Entry1());
        System.out.println(entry1);
    }

}
