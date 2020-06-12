package com.demo.adapter;

import com.demo.adapter.main.MainInterFace;
import com.demo.adapter.other.OtherInterfaceImpl;
import com.demo.adapter.other.UserInfo;

/**
 * @author ligen
 * @title: MainAdapter
 * @projectName java
 * @description:  这是一个适配器    适配器就是，实现自己的接口(方便多态)    继承别人的实现类(重写别人方法)
 * @date 2020/6/1118:00
 */
public class MainAdapter extends OtherInterfaceImpl implements MainInterFace {



    /**
     *@ desc :  重写别人的方法吗，，如果不需要修改则也可以不重写该方法
     *@ params
     *@ return
     *@ date 2020/6/11
     *@ author ligen
     */
    @Override
    public UserInfo getUserInfo() {
        return super.getUserInfo();
    }




    /**
     * @说明:  原来这个就是一个适配器。
     */
    @Override
    public String getName() {

        // 获取别人的
        UserInfo userInfo = getUserInfo();

        //TODO  进行处理，返回自己的接口的对应类型

        return userInfo.getName();
    }
}
