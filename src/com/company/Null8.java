package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * NPE방지 코드 : null.equals("") vs "".equals(null)
 */
public class Null8 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
//        myCat.setName("bob");
//        if(myCat.getName().equals("bob")){
//            System.out.println("bob!");
//        }

        if("bob".equals(myCat.getName())){
            System.out.println("bob!");
        }


        myCat.equals(null);
    }

}
