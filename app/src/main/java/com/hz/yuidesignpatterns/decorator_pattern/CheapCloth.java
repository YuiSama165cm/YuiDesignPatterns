package com.hz.yuidesignpatterns.decorator_pattern;
/**
 * CheapCloth表示便宜的衣服
 * */
public class CheapCloth extends PersonCloth{
    public CheapCloth(Person mPerson){
        super(mPerson);
    }

    /**
     * 穿短裤
     * */
    private void dressShorts(){
        System.out.println("穿件短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
