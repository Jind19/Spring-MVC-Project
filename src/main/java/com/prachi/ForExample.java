package com.prachi;

import java.util.ArrayList;

public class ForExample {


    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList();
        firstList.add("abc");
        firstList.add("dfgdfg");
        firstList.add("dfbnvbngdfg");
        firstList.add("ertert");

        for (String s : firstList) {
            if(s.equals("ertert")) {
                System.out.println(s);
            }

        }
    }
}

