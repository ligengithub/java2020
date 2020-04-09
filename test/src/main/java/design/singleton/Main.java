package design.singleton;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 单例模式，就是一个类只能被实例化出一个对象，不能让你创建出第二个对象。
 * @date 2020/4/817:07
 */
public class Main {

    public static void main(String[] args) {

        method1();

        method2();

        method3();

        method4();

        method5();

        method6();


    }


    /**
     * @说明: 饿汉式构造方法实现
     */
    public static void method1() {
        Entry1 entry = Entry1.getEntry();
        Entry1 entry2 = Entry1.getEntry();
        System.out.println(entry == entry2);
    }


    /**
     * @说明: 饿汉式静态代码块
     */
    public static void method2() {
        Entry2 entry = Entry2.getEntry();
        Entry2 entry2 = Entry2.getEntry();

        System.out.println(entry == entry2);
    }


    /**
     * @说明: 懒汉式  存在并发问题,通过加锁的方式，可以解决线程安全问题但是性能下降
     */
    public static void method3() {
        Entry3 entry = Entry3.getEntry();
        Entry3 entry2 = Entry3.getEntry();

        System.out.println(entry == entry2);
    }


    /**
     * @说明: 静态内部类
     */
    public static void method4() {
        Entry4 entry = Entry4.getEntry();
        Entry4 entry2 = Entry4.getEntry();

        System.out.println(entry == entry2);
    }

    /**
     * @说明: 双重检查式
     */
    public static void method5() {
        Entry5 entry = Entry5.getEntry();
        Entry5 entry2 = Entry5.getEntry();

        System.out.println(entry == entry2);
    }

    /**
     * @说明: 枚举类
     */
    public static void method6() {
        Entry6 entry = Entry6.INSTANCE;
        Entry6 entry2 = Entry6.INSTANCE;
        entry.method();
        entry2.method();
        System.out.println(entry == entry2);
    }


}



