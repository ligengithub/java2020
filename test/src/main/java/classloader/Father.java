package classloader;

/**
 * @author ligen
 * @title: Father
 * @projectName java2020
 * @description:
 * @date 2020/4/917:07
 */
public class Father {



    static {
        System.out.println("father static");
    }

    public Father() {
        System.out.println("father constructor");
    }
}
