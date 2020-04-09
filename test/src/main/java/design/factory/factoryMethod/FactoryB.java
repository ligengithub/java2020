package design.factory.factoryMethod;

/**
 * @author ligen
 * @title: FactoryB
 * @projectName java2020
 * @description:  专门生产ProductB对象的工厂
 * @date 2020/4/99:54
 */
public class FactoryB implements FactoryInterface {

    public Product createProduct() {
        return new ProductB();
    }
}
