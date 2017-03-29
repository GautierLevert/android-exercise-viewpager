package com.example.levertg.pagerapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new TestFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(TestFragment.ARG_NUMBER, position + 1);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "PAGE " + (position + 1);
    }

}
