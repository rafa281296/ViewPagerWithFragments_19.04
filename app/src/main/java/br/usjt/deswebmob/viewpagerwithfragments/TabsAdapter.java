package br.usjt.deswebmob.viewpagerwithfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by arqdsis on 19/04/2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new Fragment1();
        }
        else if (position == 1){
            return new Fragment2();
        }
        else{
            return new Fragment3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
