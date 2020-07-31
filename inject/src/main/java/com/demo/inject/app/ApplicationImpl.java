package com.demo.inject.app;

import com.demo.inject.log.Log;
import com.demo.inject.module.MyAppModule;
import com.demo.inject.user.UserService;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * @author ligen
 * @title: ApplicationImpl
 * @projectName ingect
 * @description:
 * @date 2019/12/1617:28
 */
public class ApplicationImpl implements Application {

    @Inject
    private UserService userService;

    @Inject
    private Log log;

    private static Injector injector;


    static {
        injector = Guice.createInjector(new MyAppModule());
    }



    public void test() {
        userService.sayHello();
        log.writeLog();
    }

    public static void main(String[] args) {
        Application instance = injector.getInstance(Application.class);
        instance.test();
    }

}
