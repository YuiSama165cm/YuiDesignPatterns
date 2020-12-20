package com.hz.yuidesignpatterns.factory_pattern.reflection_factory;

import com.hz.yuidesignpatterns.factory_pattern.Product;
/**
 * 对于具体工厂类，则通过反射获取类的示例即可
 * */
public class ConcreteFactory extends Factory{
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) p;
    }
}
