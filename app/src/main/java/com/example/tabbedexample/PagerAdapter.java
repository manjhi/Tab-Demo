package com.example.tabbedexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;


    public PagerAdapter(android.support.v4.app.FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
       switch (position){
           case 0:
               RequestTab requestTab=new RequestTab();
               return requestTab;
           case 1:
               ChatTab chatTab=new ChatTab();
               return chatTab;
           case 2:
               FriendsTab friendsTab=new FriendsTab();
               return friendsTab;
               default:
                   return null;
       }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
