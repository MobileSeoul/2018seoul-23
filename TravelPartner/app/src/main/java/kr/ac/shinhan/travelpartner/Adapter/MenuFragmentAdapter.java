package kr.ac.shinhan.travelpartner.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

public class MenuFragmentAdapter extends android.support.v13.app.FragmentStatePagerAdapter {

    public List<Fragment> mFragmentList = new ArrayList<>();

    public MenuFragmentAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }

    public void switchFragment(int position, Fragment fragment){
        mFragmentList.remove(position);
        mFragmentList.add(position, fragment);
    }
}