package com.company;

/**
 * 래퍼 클래스의 경우 null 할당 가능하기에 null pointer exception 발생 가능성이 있음
 * */
public class Null2 {
    public static void main(String[] args){
        Boolean capitalB = null;
        if(capitalB == true) {
            System.out.println("true!");
        }

    }
}
