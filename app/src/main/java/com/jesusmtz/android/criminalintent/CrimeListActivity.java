package com.jesusmtz.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Equipo on 04/12/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
   @Override
    protected Fragment createFragment(){
       return new CrimeListFragment();}
   }
