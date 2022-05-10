package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * NPE방지 코드
 */
public class Null6 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat firstCat = new Cat();
        firstCat.setName("firstCat!");
        cats.add(firstCat);

//        cats.get(0).getName().length();
        System.out.println(getFirstCatNameLength(cats));

    }

    private static int getFirstCatNameLength(List<Cat> cats) {
        if(cats != null) {
            if(cats.get(0)!= null){
                if(cats.get(0).getName()!=null){
                    return cats.get(0).getName().length();
                }
            }
        }
        return 0;
    }
}
