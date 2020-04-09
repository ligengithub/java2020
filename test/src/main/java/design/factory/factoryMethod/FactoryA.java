package design.factory.factoryMethod;

/**
 * @author ligen
 * @title: FactoryA
 * @projectName java2020
 * @description:  专门生产ProductA对象的工厂
 * @date 2020/4/99:54
 */
public class FactoryA implements FactoryInterface {

    public Product createProduct() {
        return new ProductA();
    }
}
