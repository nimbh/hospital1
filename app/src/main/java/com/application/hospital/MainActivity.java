package com.application.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Анализы", "Экспресс сбор и получение проб", R.drawable.screen1));
        mList.add(new ScreenItem("Уведомления", "Вы быстро узнаете о результатах", R.drawable.screen2));
        mList.add(new ScreenItem("Мониторинг", "Наши врачи всегда наблюдают \n" +
                "за вашими показателями здоровья", R.drawable.screen3));
        screenPager = findViewById(R.id.viewPager2);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mList);

        screenPager.setAdapter(introViewPagerAdapter);
    }
}