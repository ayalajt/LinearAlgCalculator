package com.example.cmsc_355_g18_csbuddy.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.cmsc_355_g18_csbuddy.HomeCalculator;
import com.example.cmsc_355_g18_csbuddy.JavaCalculation;
import com.example.cmsc_355_g18_csbuddy.JavaCalculationActivity;
import com.example.cmsc_355_g18_csbuddy.MatrixCalculator;
import com.example.cmsc_355_g18_csbuddy.PermutationCombination;
import com.example.cmsc_355_g18_csbuddy.R;
import com.example.cmsc_355_g18_csbuddy.TruthTables;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.calcTab, R.string.matrixTab, R.string.permCombTab, R.string.truthTab, R.string.javaTab};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeCalculator homeCalculator = new HomeCalculator();
                return homeCalculator;
            case 1:
                MatrixCalculator matrixCalculator = new MatrixCalculator();
                return matrixCalculator;
            case 2:
                PermutationCombination permutationCombination = new PermutationCombination();
                return permutationCombination;
            case 3:
                TruthTables truthTables = new TruthTables();
                return truthTables;
            case 4:
                JavaCalculationActivity javaCalculationActivity = new JavaCalculationActivity();
                return javaCalculationActivity;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 5;
    }
}