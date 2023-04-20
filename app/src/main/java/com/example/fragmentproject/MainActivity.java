package com.example.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnViewCreated();
    }

    private void OnViewCreated() {
        tabLayout = (TabLayout) findViewById(R.id.tab_option);
        viewPager = (ViewPager2) findViewById(R.id.current_view);
        MainViewPager mainViewPager = new MainViewPager(this);
        viewPager.setAdapter(mainViewPager);
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Thong Tin");
                    break;
                case 1:
                    tab.setText("Danh sach");
                    break;
                case 2:
                    tab.setText("Tim kiem");
                    break;
                default:
                    tab.setText("hello");
                    break;
            }
        }).attach();
    }

}