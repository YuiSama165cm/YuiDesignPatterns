package com.hz.yuidesignpatterns.iterator_pattern;
/**
 * 主管类
 * */
public class Director extends Leader {
    @Override
    public void handle(int money) {
        System.out.println("主管批复报销"+money+"元");
    }

    @Override
    public int limit() {
        return 5000;
    }
}
