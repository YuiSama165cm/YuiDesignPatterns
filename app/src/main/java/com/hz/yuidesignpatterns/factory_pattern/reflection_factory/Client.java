package com.hz.yuidesignpatterns.factory_pattern.reflection_factory;

import com.hz.yuidesignpatterns.factory_pattern.ConcreteProductB;
import com.hz.yuidesignpatterns.factory_pattern.Product;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        //需要哪一个类的对象就传入哪一个类的类型即可，这种方法比较简洁、动态。
        Product p = factory.createProduct(ConcreteProductB.class);
        p.method();
    }
}
