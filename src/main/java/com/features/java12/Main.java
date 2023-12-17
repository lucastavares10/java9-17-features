package com.features.java12;

public class Main {

    public static void main(String[] args) {

        //new switch
        String value = "case2";

        switch (value) {
            case "case1" -> System.out.println("Enter in case 1");
            case "case2", "case3" -> System.out.println("Enter in case 2 or 3");
            default -> System.out.println("Case not found :c");
        }



    }
}
