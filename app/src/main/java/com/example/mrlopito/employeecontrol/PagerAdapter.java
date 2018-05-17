package com.example.mrlopito.employeecontrol;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numOfPages;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                EmployeeFragment employeeFragment = new EmployeeFragment();
                return employeeFragment;

            case 1:
                OfficeFragment officeFragment = new OfficeFragment();
                return officeFragment;

            default:
                return null;
                

        }
    }

    @Override
    public int getCount() {
        return numOfPages;
    }
}
