package com.company.fusball1;

public class Person {
    private String name;
    private int alter;

    public Person(String personName, int personAlter) {

        this.name = personName;
        this.alter = personAlter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

}
