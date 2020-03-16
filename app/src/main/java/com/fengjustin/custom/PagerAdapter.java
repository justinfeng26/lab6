package com.fengjustin.custom;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class PagerAdapter extends FragmentPagerAdapter{
    private int numtabs;
    public PagerAdapter(FragmentManager fm, int x){
        super(fm);
        this.numtabs=x;
    }


    public Fragment getItem(int position){
        switch(position) {
            case 0:
                return new info();
            case 1:
                return new welc();

            default:
                return null;
        }
    }

    public int getCount(){
        return numtabs;
    }
}
