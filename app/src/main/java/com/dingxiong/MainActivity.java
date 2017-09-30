package com.dingxiong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.m_lou.comonview.CommonViewUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonViewUtil.init(this);
    }
}
