package com.company;

public class Cat {
    public String name;
    public long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("ㅇㅑ옹!");
    }
}
