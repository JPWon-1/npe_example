package com.company;

/**
 * 널 객체의 필드나 메서드 접근 시 널 포인터 익셉션 발생 예제
 */
public class Null1 {
    public static void main(String[] args) {
	    Cat myCat = new Cat();
//        myCat = null;
        long age = myCat.age;
        myCat.getAge();
        myCat.makeNoise();
    }
}
