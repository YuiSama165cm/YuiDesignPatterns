package com.hz.yuidesignpatterns.decorator_pattern;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class DecoratorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化数据
        initData();
        //初始化控件
        initViews();
        //初始化事件
        initEvent();
        
    }

    private void initEvent() {
    }

    private void initViews() {
    }

    private void initData() {
    }
}
