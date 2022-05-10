package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * NPE방지 코드 : Collection 에 empty List를 반환하면 null Check를 덜 할 수 있다.
 */
public class Null7 {
    public static void main(String[] args) {
        List<Cat> cats = getCats();
        System.out.println(getFirstCatNameLength(cats));

    }

    private static List<Cat> getCats() {
//        List<Cat> cats = catRepository.getAll();
        List<Cat> cats = new ArrayList<>();
//        Cat firstCat = new Cat();
//        firstCat.setName("firstCat!");
//        cats.add(firstCat);
        if(cats == null || cats.size() == 0) {
            return null;
//            return new ArrayList<>();
        }

        return cats;
    }

    private static int getFirstCatNameLength(List<Cat> cats) {
//        if(cats != null) {
            if(cats.get(0)!= null){
                if(cats.get(0).getName()!=null){
                    return cats.get(0).getName().length();
                }
            }
//        }
        return 0;
    }
}
