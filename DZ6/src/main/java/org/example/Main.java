package org.example;


import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        ArrayList<String> capitals = new ArrayList<>(); // list with duplicates

        capitals.add("Kyiv");
        capitals.add("London");
        capitals.add("Berlin");
        capitals.add("Tokyo");
        capitals.add("Paris"); //
        capitals.add("Paris"); //
        capitals.add("Rome");
        capitals.add("Brasília"); //
        capitals.add("Brasília"); //
        capitals.add("Brasília"); //
        capitals.add("Seoul");

        String[] countries = {
                "Ukraine",
                "United States",
                "United Kingdom",
                "Germany",
                "Japan",
                "France",
                "Canada"
        };

        ListArrayActions action = new ListArrayActions();

        // task 1
        System.out.println("Find element from List: " + action.isElementExist(capitals, "Brasília"));
        System.out.println("Find element from Array: " + action.isElementExist(countries, "France"));
        // task 2
        action.deleteDuplicatesAndPrintSet(capitals);
    }


}