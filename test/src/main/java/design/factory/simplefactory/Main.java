package design.factory.simplefactory;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 简单工厂模式
 * @date 2020/4/910:01
 */
public class Main {

    /**
     * @说明: 网上说，简单(静态)工厂的模式最大弊端就是，在工厂实例化对象的时候，做了判断，
     * <p>
     * 这样如果新增加一个产品，那么工厂方法也需要改动。不符合开闭原则。
     * <p>
     * 但是如果使用反射的方式去创建产品的话，上面问题将不存在。新添加产品，只需要添加产品对应类即可。
     * <p>
     * <p>
     * 总结：简单工厂模式，就是使用一个工厂去生产对象，
     * 通过工厂方法中添加判断，去决定生产的对象(不使用反射的情况下)。
     * <p>
     * 但是反射创建对象的时间相对来说是比较慢的
     * 如果创建的对象不是很多，或者是很重量级别(成员变量和成员方法多)。的情况下，推荐使用反射。
     */


    public static void main(String[] args) {

        /**
         * @说明: 方法1 使用反射，可以随意添加产品，只要实现我们的产品接口即可。
         * 不用修改工厂方法。
         */

        Factory factory = new Factory();
        factory.createProduct(ProductA.class).getInfo();
        factory.createProduct(ProductB.class).getInfo();


        /**
         * @说明: 不使用反射 ,新添加一个产品类，需要修改工厂方法
         */
        factory.createProductByName("ProductA_V0").getInfo();
        factory.createProductByName("ProductB_V0").getInfo();
        factory.createProductByName("ProductC_V0").getInfo();


        testEfect(factory);


    }


    /**
     * @ desc : 测试反射创建对象和直接创建对象的效率对比
     * @ params [factory]
     * @ return void
     * @ date 2020/4/9
     * @ author ligen
     */
    public static void testEfect(Factory factory) {
        int i = 1000000;

        long t1 = System.currentTimeMillis();
        for (int i1 = 0; i1 < i; i1++) {
            factory.createProduct(ProductA.class);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("反射创建" + i + "对象耗时" + (t2 - t1));


        long t3 = System.currentTimeMillis();
        for (int i1 = 0; i1 < i; i1++) {
            factory.createProductByName("ProductA_V0");
        }
        long t4 = System.currentTimeMillis();
        System.out.println("反射创建" + i + "对象耗时" + (t4 - t3));

    }


}
