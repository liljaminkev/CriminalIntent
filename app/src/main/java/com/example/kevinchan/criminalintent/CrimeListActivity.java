package com.example.kevinchan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by kevin on 5/1/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
