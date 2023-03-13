package com.company;

public class Animal {

    //ATTRIBUTES
    String type;
    String size;
    String name;
    double weight;
    String habitat;

    //CONSTRUCTOR
    public Animal(String type, String size, String name, double weight, String habitat){
        this.type = type;
        this.size = size;
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
    }

    //METHODS
    public void introduction(){
        String introductionSentence = "Hello mother fucker... my name is " + name + "! I am a very " + size +
                type + "! I weigh " + weight + " and I live in " + habitat;
        System.out.println(introductionSentence);
    }
}