package com.company.model;

import java.io.Serializable;

/**
 * Created by Umberto on 01/11/2016.
 */
public class Game implements Serializable{

    private String name;
    private double prix;

    public Game(String name, double prix) {
        this.name = name;
        this.prix = prix;
    }

    @Override
    public String toString(){
        return name + " - " + prix + " €";
    }
}
