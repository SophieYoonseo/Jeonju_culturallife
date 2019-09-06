package com.example.cardview_test1;

import com.example.cardview_test1.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    public List<Item> getAllItems(){
        return dummyData();
    }

    private List<Item> dummyData(){
        List<Item> dummyList = new ArrayList<>();
        dummyList.add(new Item("A","apple"));
        dummyList.add(new Item("B","Baggin"));
        dummyList.add(new Item("C","Cati"));
        dummyList.add(new Item("D","Dadday"));
        return dummyList;
    }

}