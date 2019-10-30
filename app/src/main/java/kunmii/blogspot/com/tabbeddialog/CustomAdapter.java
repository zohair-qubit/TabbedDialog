package kunmii.blogspot.com.tabbeddialog;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olakunmi on 21/01/2017.
 */

public class CustomAdapter extends FragmentPagerAdapter {
    List<Fragment> mFragmentCollection = new ArrayList<>();
    List<String> mTitleCollection = new ArrayList<>();

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(String title, Fragment fragment)
    {
        mTitleCollection.add(title);
        mFragmentCollection.add(fragment);
    }

    //Needed for
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleCollection.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentCollection.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentCollection.size();
    }
}
