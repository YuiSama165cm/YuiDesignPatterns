package com.hz.yuidesignpatterns.iterator_pattern;
/**
 * 老板类
 * */
public class Boss extends Leader {
    @Override
    public void handle(int money) {
        System.out.println("老板批复报销"+money+"元");
    }

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }
}
