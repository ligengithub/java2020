package design.factory.abstructFactory.factoryMethod;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 抽象工厂模式
 * @date 2020/4/910:01
 */
public class Main {

    /**
     * @说明: 抽象工厂模式， 比如 产品A B C 都对应区分多种型号,(office wps  ... 我想不出其它的)。
     *
     * 好比于 你安装的Office，又有不同版本 1.0.0  1.0.1   .....等。
     *
     * 抽象工厂模式就是，除了对产品类型进行抽象，再对型号再进行抽象。如果再分版本(office专业版，家庭版.) 等等....等这种区分挨个进行抽象。
     *
     * 抽象工厂模式，相比于工厂方法模式，，我们取消了对某种产品的工厂实现，，我们将 产品按照不同维度(配置，版本.....)，，抽象为不同类型的工厂。
     * (分类要注意，划分维度的时候不要划分很多，不然。不同维度的排列相互组合会特别多）
     *
     *
     *
     */


    public static void main(String[] args) {


        /**
         * @说明:  每一个工厂都是对某一种类型
         *
         * 比如Factory_V1 就生产V1 版本
         *     Factory_V2 就生产V2 版本
         *
         * 如果添加新的版本，我们只需添加V3版本的实体，和创建V3版本的工厂即可，
         *
         *
         */
        FactoryInterface factoryA = new Factory_V1();
        FactoryInterface factoryB = new Factory_V2();


         factoryA.createProductA().getInfo();
         factoryA.createProductB().getInfo();
         factoryA.createProductC().getInfo();

         factoryB.createProductA().getInfo();
         factoryB.createProductB().getInfo();
         factoryB.createProductC().getInfo();


    }


}
