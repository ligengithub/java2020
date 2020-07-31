package com.demo.reflect.properties;

import com.demo.reflect.entry.People;
import com.demo.reflect.entry.People2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ligen
 * @title: ReflectDemo2
 * @projectName reflect
 * @description: 根据配置文件动态加载类实例
 * @date 2020/2/2713:29
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {


//        loadPropertiesFile();

        conTest(People2.class);
    }

    /**
     * @说明: 根据配置文件加载类，使用反射获取类的方法并执行
     */
    static void loadPropertiesFile() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();

        // 获取配置文件方式1
//          FileInputStream fileInputStream = new FileInputStream("C:\\Users\\xx\\Desktop\\spi\\java2020\\reflect\\target\\classes\\test.properties");

        //  方式2
//        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/test.properties"));

        // 方式3
//        FileInputStream fileInputStream = new FileInputStream( ".\\src\\main\\resources\\test.properties");

        // 方式4
        InputStream fileInputStream = ReflectDemo2.class.getClassLoader().getResourceAsStream("test.properties");


        properties.load(fileInputStream);

        String loadclass = properties.getProperty("load");


        Class<?> aClass = Class.forName(loadclass);
//        Class<?> aClass = Class.forName("com.spi.reflect.entry.People2");
        Method method = aClass.getDeclaredMethod("method");

        // 注意获取带参数的方法，这里要传入参数的类型，，多个参数注意顺序
        Method method2 = aClass.getDeclaredMethod("method2", String.class);
        method.setAccessible(true);
        Object instance = aClass.newInstance();
        method.invoke(instance);
        method2.setAccessible(true);
        method2.invoke(instance, "123");


    }

    /**
     * @ desc :  反射通过构造参数实例化对象
     * @ params
     * @ return
     * @ date 2020/2/27
     * @ author ligen
     */
    static <T> void conTest(Class<T> c) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> constructor = c.getDeclaredConstructor(String.class);
        T ligen = constructor.newInstance("ligen");
        System.out.println(ligen.toString());
    }

}
