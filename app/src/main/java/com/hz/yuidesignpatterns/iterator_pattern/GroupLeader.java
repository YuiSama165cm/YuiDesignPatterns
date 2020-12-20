package com.hz.yuidesignpatterns.iterator_pattern;
/**
 * 组长类
 * */
public class GroupLeader extends Leader {
    @Override
    public void handle(int money) {
        System.out.println("组长批复报销"+money+"元");
    }

    @Override
    public int limit() {
        return 1000;
    }
}
