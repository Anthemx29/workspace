package com.cparris.CopyConstructor;

public class Shirt implements Cloneable {
    final private int id;
    private String color;
    static private int uniqueId;

    {
        System.out.println("Creating Shirt... ");
        id = uniqueId++;
    }

    public Shirt(String color){
        this.color = color;
    }

    protected Shirt(Shirt otherShirt){
        color = otherShirt.color;
    }

    //Can use reflection to only have Clone here, and not in any subclass, TBD
    public Object clone(){
        return new Shirt(this);
    }

    public String toString(){
        return String.format("%s: hashCode: %d id: %d color: %s", getClass(), hashCode(), id, color);
    }

}

