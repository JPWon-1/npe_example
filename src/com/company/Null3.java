package com.company;

import java.util.List;

/**
 * null 인 컬렉션에 접근할 때 null pointer exception 발생 가능성 있음
 * 컬렉션에는 null로 initialized하는 것 보다는 emptyList로 초기화 해주는 것이 좋음
 * */
public class Null3 {
    public static void main(String[] args){
        List<String> catNames = null;
//        List<String> catNames = new ArrayList<>();
        for (String catName : catNames) {
            System.out.println(catName);
        }
    }
}
