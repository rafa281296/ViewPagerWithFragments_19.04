package br.usjt.deswebmob.viewpagerwithfragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by arqdsis on 19/04/2018.
 */

public class MyTabsListener implements ActionBar.TabListener {
    private ViewPager viewPager;
    private int index;

    public MyTabsListener(ViewPager viewPager, int index) {
        this.viewPager = viewPager;
        this.index = index;
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
