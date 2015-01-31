package com.camocim.camocimofertas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Novas Ofertas fragment activity
            return new NovasOfertas();
        case 1:
            // Comidas fragment activity
            return new Comidas();
        case 2:
            // Bebidas fragment activity
            return new Bebidas();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // conta o número de iten  - igual ao número de abas
        return 3;
    }

}
