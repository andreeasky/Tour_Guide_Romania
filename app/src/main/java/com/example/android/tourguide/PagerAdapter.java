package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link PagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public PagerAdapter(Context context, FragmentManager fm) {
        super ( fm );
        mContext = context;

    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CitiesFragment ();
        } else if (position == 1) {
            return new CastlesFragment ();
        } else if (position == 2) {
            return new MountainsFragment ();
        } else if (position == 3) {
            return new MonasteriesFragment ();
        } else if (position == 4) {
            return new UnescoSitesFragment ();
        } else {
            return new VillagesFragment ();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString ( R.string.category_cities );
        } else if (position == 1) {
            return mContext.getString ( R.string.category_castles );
        } else if (position == 2) {
            return mContext.getString ( R.string.category_mountains );
        } else if (position == 3) {
            return mContext.getString ( R.string.category_monasteries );
        } else if (position == 4) {
            return mContext.getString ( R.string.category_unesco_sites );
        } else {
            return mContext.getString ( R.string.category_villages );
        }
    }
}



