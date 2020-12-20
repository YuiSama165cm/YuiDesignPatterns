package com.hz.yuidesignpatterns.factory_pattern.factory;

import com.hz.yuidesignpatterns.factory_pattern.Product;

public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     *
     * @return 具体产品对象
     * */
    public abstract Product createProduct();
}
