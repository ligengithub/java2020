package design.agency;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description:
 * @date 2020/4/816:49
 */
public class Main {
    public static void main(String[] args) {
        // 创建一个代理人，传入要代理对象,看起来是agency 在干活，实际上是被代理人在干活。
//  通过使用java的多态实现
        Agency agency = new Agency(new BeAgency1());
        System.out.println(agency.work());
        Agency agency2 = new Agency(new BeAgency2());
        System.out.println(agency2.work());
    }
}
