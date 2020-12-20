package com.hz.yuidesignpatterns.factory_pattern.reflection_factory;

import com.hz.yuidesignpatterns.factory_pattern.Product;

public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     *
     * @param clz 产品对象类型
     * @return 具体产品对象
     * */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
