package com.cparris.CopyConstructor;

public class HawaiianShirt extends Shirt{
    public HawaiianShirt(String color){
        super(color);
    }
    protected HawaiianShirt(HawaiianShirt otherShirt){
        super(otherShirt);
    }
    public Object clone(){
        return new HawaiianShirt(this);
    }
}