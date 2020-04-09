package design.factory.abstructFactory.factoryMethod;

/**
 * @author ligen
 * @title: FactoryB
 * @projectName java2020
 * @description: 专门生产ProductB对象的工厂
 * @date 2020/4/99:54
 */
public class Factory_V2 implements FactoryInterface {


    public Product createProductA() {
        return new ProductA_V0();
    }

    public Product createProductB() {
        return new ProductB_V0();
    }

    public Product createProductC() {
        return new ProductC_V0();
    }
}
