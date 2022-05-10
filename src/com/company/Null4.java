package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 자바 14 이전 버젼에서는 어떤 부분에서 NPE가 발생했는지 라인으로만 알려준다
 * -> 14이후에는 어떤 참조값에서 null pointer exception이 발생하는 지 알 수 있다.
 * -> 14이전에는 라인만 출력되기에 정확히 어떤부분에서 익셉션이 발생하는건지 알 수 없다.
 * */
public class Null4 {
    public static void main(String[] args){
        List<Cat> cats = null;
//        cats.add(new Cat());
//        catRepository.getAll();
        cats.get(0).getName().length();
    }
}
