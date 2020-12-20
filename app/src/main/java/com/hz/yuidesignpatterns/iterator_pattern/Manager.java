package com.hz.yuidesignpatterns.iterator_pattern;
/**
 * 经理类
 * */
public class Manager extends Leader {
    @Override
    public void handle(int money) {
        System.out.println("经理批复报销"+money+"元");
    }

    @Override
    public int limit() {
        return 10000;
    }
}
