package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ligen
 * @title: starter
 * @projectName java
 * @description:
 * @date 2020/7/288:38
 */
@ConfigurationProperties(prefix = "animal")
public class AnimalProperties {

    private String type = "animal";

    private String name;

    private final Fish fish = new Fish();

    private final bird bird = new bird();

    public static class Fish {

        private String doing;

        public String getDoing() {
            return doing;
        }

        public void setDoing(String doing) {
            this.doing = doing;
        }
    }

    public static class bird {

        private String doing;

        public String getDoing() {
            return doing;
        }

        public void setDoing(String doing) {
            this.doing = doing;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fish getFish() {
        return fish;
    }

    public AnimalProperties.bird getBird() {
        return bird;
    }

    //  省略get set 方法
}
