package com.demo.spi.filter;

import java.util.*;

/**
 * @author ligen
 * @title: FilterManang
 * @projectName java
 * @description:
 * @date 2020/7/3110:42
 */
public class FilterManang {


    private static LinkedList<Filter> filters = new LinkedList<>();

    private static Filter headFilter = null;


    public static void addFilter(Filter filter) {

        filters.add(filter);
    }

    public static Integer getFilterSize() {
        return filters.size();
    }


    public static Filter getHeadFilter() {

        return headFilter;
    }


    private static Filter getLastFilter() {
        return filters.getLast();
    }


}
