package design.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式4  静态内部类
 * @date 2020/4/817:09
 */
public class Entry4 {

    private Entry4() {

    }

    public static Entry4 getEntry() {
        return InnerClasss.entry4;
    }

    private static class InnerClasss {
        private static Entry4 entry4 = new Entry4();
    }
}
