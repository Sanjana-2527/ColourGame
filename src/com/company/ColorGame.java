package com.company;
import java.util.HashMap;

public interface ColorGame {
    HashMap<String,Integer> colors = new HashMap<>();
    String getName();

    default String print(String color) {
        return "I'm "+getName()+"! I'm sometimes "+color;
    }

}

class Frog implements ColorGame{

    Frog(){
        colors.put("blue", 1);
        colors.put("yellow", 1);
    }

    @Override
    public String getName() {
        return "Frog";
    }

    public String print(String color) {
        return "I'm "+getName()+"! I am "+color+" today";
    }

}

class Apple implements ColorGame{
    public Apple(){
        colors.put("Green",1);
        colors.put("Red",1);
    }

    @Override
    public String getName() {
        return "Apple";
    }
}

class Sky implements ColorGame{
    public Sky(){
        colors.put("Blue",1);
        colors.put("Black",1);
    }

    @Override
    public String getName() {
        return "Sky";
    }
}



class Banana implements ColorGame{
    public Banana(){
        colors.put("Green",1);
        colors.put("Yellow",1);
    }

    @Override
    public String getName() {
        return "Banana";
    }
}

class Ink implements ColorGame{
    public Ink(){
        colors.put("Red",1);
        colors.put("Black",1);
    }

    @Override
    public String getName() {
        return "Ink";
    }
}

class Blood implements ColorGame{
    public Blood(){
        colors.put("Red",1);
    }

    @Override
    public String getName() {
        return "Blood";
    }
}



class Salt implements ColorGame{
    public Salt(){
        colors.put("White",1);
    }

    @Override
    public String getName() {
        return "Salt";
    }
}


