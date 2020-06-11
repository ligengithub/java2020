/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Test {

    public static void main(String[] args) {

        test1();
    }


    public static void test1() {

        try {
            test2();
        } catch (Exception e) {
            System.out.println("test1 exception");
        }
    }

    public static void test2() {
//        try {

            System.out.println(2 / 0);
//        } catch (Exception e) {
//
//            System.out.println("test2 exception");
//
//        }
    }

}