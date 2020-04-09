package design.factory.abstructFactory.factoryMethod;

/**
 * @author ligen
 * @title: FactoryA
 * @projectName java2020
 * @description:  专门生产ProductA对象的工厂
 * @date 2020/4/99:54
 */
public class Factory_Office implements FactoryInterface {

    public Product createProductA() {
        return new ProductA_V1();
    }

    public Product createProductB() {
        return new ProductB_V1();
    }

    public Product createProductC() {
        return new ProductC_V1();
    }
}
