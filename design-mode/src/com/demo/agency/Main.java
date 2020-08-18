package com.demo.agency;

/**
 * @author ligen
 * @title: Main
 * @projectName java
 * @description:
 * @date 2020/8/189:40
 */
public class Main {

    public static void main(String[] args) {
        Agency agency = new Agency(new BeAgency1());
        System.out.println(agency.work());
        Agency agency2 = new Agency(new BeAgency2());
        System.out.println(agency2.work());
    }
}
