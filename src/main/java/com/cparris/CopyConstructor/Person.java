package com.cparris.CopyConstructor;

public class Person implements Cloneable {

    private String name;
    private int age;
    private Shirt shirt;
    //private Pants pants;

    public Person(String name, int age, Shirt shirt){
        this.name = name;
        this.age = age;
        this.shirt = shirt;
    }

    protected Person(Person other){
        name = other.name;
        age = other.age;
        shirt = (Shirt) other.shirt.clone();
    }

    public Object clone(){
        return new Person(this);
    }

    public String toString(){
        return String.format("%s: hashCode: %d Name: %s Age: %d Shirt: %s",getClass(), hashCode(), name, age, shirt);
    }

}


