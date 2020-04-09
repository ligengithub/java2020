package design.factory.simplefactory;

/**
 * @author ligen
 * @title: FactoryA
 * @projectName java2020
 * @description:
 * @date 2020/4/99:54
 */
public class Factory {


    /**
     * @说明: 使用反射的方式创建对象,
     * 方便，当新添加一个产品类的时候工厂方法不用动
     */
    public Product createProduct(Class<? extends Product> c) {
        try {
            return c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @说明: 不使用反射，每添加一个产品，这里都需要添加一个判断分支
     */
    public Product createProductByName(String name) {
        if ("ProductA_V0" == name) {
            return new ProductA();
        } else if ("ProductB_V0" == name) {
            return new ProductB();
        } else if ("ProductC_V0" == name) {
            return new ProductC();
        } else {
            System.out.println("类不存在");
            return null;
        }


    }

}
