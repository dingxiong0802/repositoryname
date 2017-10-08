package com.dingxiong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.m_lou.comonview.CommonViewUtil;
/**
 * 制作自己依赖的步骤
 * 1.先自己新建一个library通过gitup分享到gutup远程仓库中
 * 2.新建relase填写版本号和描述信息,把仓库的地址发不到jitPack上面后自动把你关联的库变成一个依赖
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonViewUtil.init(this);
    }
}
