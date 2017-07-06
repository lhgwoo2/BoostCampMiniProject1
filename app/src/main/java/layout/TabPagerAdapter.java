package layout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;
    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Tab1 tabFragment1 = new Tab1();
                return tabFragment1;
            case 1:
                Tab2 tabFragment2 = new Tab2();
                return tabFragment2;
            case 2:
                Tab3 tabFragment3 = new Tab3();
                return tabFragment3;
            case 3:
                Tab4 tabFragment4 = new Tab4();
                return tabFragment4;
            default:
                return null;

        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }


}
