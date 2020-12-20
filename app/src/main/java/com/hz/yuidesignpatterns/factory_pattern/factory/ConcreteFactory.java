package com.hz.yuidesignpatterns.factory_pattern.factory;

import com.hz.yuidesignpatterns.factory_pattern.ConcreteProductA;
import com.hz.yuidesignpatterns.factory_pattern.Product;

public class ConcreteFactory extends Factory{

    @Override
    public Product createProduct() {
        //手动替换即可
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
