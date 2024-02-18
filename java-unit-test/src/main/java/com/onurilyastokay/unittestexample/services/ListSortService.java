package com.onurilyastokay.unittestexample.services;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortService {
    
    public ArrayList<Integer> sortList(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
