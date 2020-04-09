package design.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式1   饿汉式，静态代码块
 * @date 2020/4/817:09
 */
public class Entry2 {

    private static Entry2 entry1;

    static {
        entry1 = new Entry2();
    }

    private Entry2() {

    }

    static Entry2 getEntry() {
        return entry1;
    }
}
