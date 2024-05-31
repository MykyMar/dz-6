package org.example;

import java.util.LinkedHashSet;
import java.util.List;


public class ListArrayActions {

    // task 1 for List
    public boolean isElementExist(List<String> list, String find) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
            return false;
        }
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).equals(find)) {
                return true;
            }
            i++;
        }
        return false;
    }

    // task 1 for array
    public boolean isElementExist(String[] array, String find) {
        if (array.length == 0) {
            System.out.println("Array is empty!");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(find)) {
                return true;
            }
        }

        return false;
    }

    // task 2
    public void deleteDuplicatesAndPrintSet(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
        }

        LinkedHashSet<String> setList = new LinkedHashSet<>();
        setList.addAll(list);
        for (String s : setList) {
            System.out.println(s);
        }
    }
}
