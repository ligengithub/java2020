package design.strategy;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 策略模式和简单代理模式的最大区别就是
 * <p>
 * 代理模式，代理人和被代理人实现的是同一个接口，代理人知道被代理人的所有方法
 * <p>
 * 策略模式，没有代理人，只有一个容器，容器不知道策略具体是什么，只是根据拿到不同的策略执行对应策略的方法。种瓜得瓜，种豆得豆的感觉。
 * @date 2020/4/817:02
 */
public class Main {

    public static void main(String[] args) {

        DoStrate doStrate = new DoStrate(new Strategy1());
        doStrate.exec();
        DoStrate doStrate2 = new DoStrate(new Strategy1());
        doStrate2.exec();

    }
}
