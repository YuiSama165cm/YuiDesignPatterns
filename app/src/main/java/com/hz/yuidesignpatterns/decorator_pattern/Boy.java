package com.hz.yuidesignpatterns.decorator_pattern;
/**
 * Person的实现类
 * */
public class Boy extends Person {
    @Override
    public void dressed() {
        //Boy类下dressed方法的基本逻辑
        System.out.println("穿了内衣内裤");
    }
}
