package com.example.fragmentproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainViewPager extends FragmentStateAdapter {
    public MainViewPager(@NonNull FragmentActivity fm){
        super(fm);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment frag = null;
        switch (position){
            case 0:
                frag=new FragmentInformation();
                break;
            case 1:
                frag=new FragmentList();
                break;
            case 2:
                frag=new FragmentSearch();
                break;
        }
        return frag;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
