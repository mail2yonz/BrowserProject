package com.company;

import java.util.ArrayList;

public class Browser {

    private String title;

    public ArrayList<Tab> getTabArrayList() {
        return tabArrayList;
    }

    public void setTabArrayList(ArrayList<Tab> tabArrayList) {
        this.tabArrayList = tabArrayList;
    }

    ArrayList<Tab> tabArrayList;



    public Browser()
    {

        tabArrayList= new ArrayList<> (  );
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addTabs(Tab tab)
    {
        tabArrayList.add ( tab );
    }

}

