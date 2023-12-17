package com.features.java9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Old creation
        Set<String> namesSet = new HashSet<String>();
        namesSet.add("Ana");
        namesSet.add("Bruce");


        List<String> nameList = new ArrayList<String>();
        nameList.add("Lucas");
        nameList.add("Alfred");

        Map<String, String> countriesMap = new HashMap<>();

        countriesMap.put("Brazil", "Brasília");
        countriesMap.put("Argentina", "Buenos Aires");


        //new collection features

        Set<String> newNamesSet = Set.of("Ana", "Bruce");
        List<String> newNameList = List.of("Lucas", "Alfred");
        Map<String, String> newCountriesMap = Map.ofEntries(Map.entry("Brazil", "Brasília"), Map.entry("Argentina", "Buenos Aires"));

        System.out.println(newNamesSet);
        System.out.println(newNameList);
        System.out.println(newCountriesMap);



    }
}
