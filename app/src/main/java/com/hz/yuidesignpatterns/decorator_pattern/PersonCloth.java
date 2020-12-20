package com.hz.yuidesignpatterns.decorator_pattern;
/**
 * 装饰者类
 * */
public abstract class PersonCloth extends Person{
    protected Person mPerson;//保持一个Person类的引用

    public PersonCloth(Person mPerson){
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        //调用Person类中的dressed方法
        mPerson.dressed();
    }
}
