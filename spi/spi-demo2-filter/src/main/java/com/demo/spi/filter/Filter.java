package com.demo.spi.filter;

/**
 * @author ligen
 * @title: com.spi.filter.Filter
 * @projectName java
 * @description:
 * @date 2020/7/3110:11
 */
public interface Filter {

    void doFilter(Content context);

    Filter getBeforeFilter();

    Filter getNextFilter();

    void setBeforeFilter(Filter filter);

    void setNextFilter(Filter filter);


}