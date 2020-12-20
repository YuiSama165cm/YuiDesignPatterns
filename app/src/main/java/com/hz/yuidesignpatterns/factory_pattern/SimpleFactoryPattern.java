package com.hz.yuidesignpatterns.factory_pattern;
/**
 * 如果确定你的工厂类只有一个的话，那么可以简化去掉抽象类；
 * 这时候它就是简单工厂模式或静态工厂模式，它是工厂模式的一个弱化版本。
 * */
public class SimpleFactoryPattern {
    public static Product createProduct(){
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
