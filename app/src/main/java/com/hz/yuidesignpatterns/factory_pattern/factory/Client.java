package com.hz.yuidesignpatterns.factory_pattern.factory;

import com.hz.yuidesignpatterns.factory_pattern.Product;
//客户类：简单工厂
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct();
        p.method();
    }
}
