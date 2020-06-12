package com.demo.adapter.other;

/**
 * @author ligen
 * @title: OtherInterfaceImpl
 * @projectName java
 * @description:
 * @date 2020/6/1117:57
 */
public class OtherInterfaceImpl implements OtherInterface {


    @Override
    public UserInfo getUserInfo() {
        return new UserInfo() {{
            setName("ligen");
        }};
    }
}
