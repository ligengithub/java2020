package com.demo.inject.module;

import com.demo.inject.app.Application;
import com.demo.inject.app.ApplicationImpl;
import com.demo.inject.log.Log;
import com.demo.inject.log.LogImpl;
import com.demo.inject.user.UserService;
import com.demo.inject.user.UserServiceImpl;
import com.google.inject.AbstractModule;

/**
 * @author ligen
 * @title: MyAppModule
 * @projectName ingect
 * @description:
 * @date 2019/12/178:41
 */
public class MyAppModule extends AbstractModule {
    protected void configure() {
        bind(Log.class).to(LogImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Application.class).to(ApplicationImpl.class);
    }
}
