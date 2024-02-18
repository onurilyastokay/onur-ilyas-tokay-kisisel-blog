package com.onurilyastokay.unittestexample.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ListSortServiceTest {

    @Test
    public void whenCallSortListWithIntegerList_shouldReturnSortedList() {
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(3, 1, 2));
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> sortedList = new ListSortService().sortList(inputList);

        assertEquals(expectedList, sortedList);
    }
}
