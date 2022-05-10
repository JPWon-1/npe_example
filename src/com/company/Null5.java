package com.company;

/**
 * NPE방지 코드
 */
public class Null5 {
    public static void main(String[] args) {
	    Cat myCat = null;
        if(myCat != null) {
            myCat.makeNoise();
        }
    }
}
