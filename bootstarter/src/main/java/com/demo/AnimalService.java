package com.demo;

/**
 * @author ligen
 * @title: AnimalService
 * @projectName java
 * @description:
 * @date 2020/7/288:47
 */
public class AnimalService {

    private AnimalProperties animalProperties;

    public AnimalService(AnimalProperties animalProperties) {
        this.animalProperties = animalProperties;
    }

    public void doing() {
        System.out.println("this is animal service");
        System.out.println("type:" + animalProperties.getType());
        System.out.println("name:" + animalProperties.getName());
    }

}


