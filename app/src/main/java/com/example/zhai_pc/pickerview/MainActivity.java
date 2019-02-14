package com.example.zhai_pc.pickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PickerView minute_pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        PickerView minute_pv = (PickerView) findViewById(R.id.minute_pv);
        PickerView second_pv = (PickerView) findViewById(R.id.second_pv);
        PickerView minute_pv1 = (PickerView) findViewById(R.id.minute_pv1);
        PickerView second_pv1 = (PickerView) findViewById(R.id.second_pv1);

        List<String> data1 = new ArrayList<String>();
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                data1.add("0" + i);
            } else {
                data1.add(i + "");
            }
        }

        //设置滚动数据
        minute_pv.setData(data1);
        second_pv.setData(data1);
        minute_pv1.setData(data1);
        second_pv1.setData(data1);

        //设置选中第几条
        minute_pv.setSelected(9);
    }
}

