package com.junker.study.git.manage.obj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //添加自定义监听设置方案
    private void onClickListener(){
        //设置具体控件的监听代码逻辑
    }

    //我是分支 feature-3 增加的方法
    private void addMethidThree(){
        //具体的方法内容
    }
}