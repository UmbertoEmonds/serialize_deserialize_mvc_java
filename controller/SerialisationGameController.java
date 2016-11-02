package com.company.controller;

import com.company.model.Game;

import java.io.*;

/**
 * Created by Umberto on 01/11/2016.
 */

public class SerialisationGameController {

    ObjectOutputStream serialisation;

    public SerialisationGameController(){

        try {

            serialisation = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("games.txt"))));

            serialisation.writeObject(new Game("Need for Speed - Carbon", 7));
            serialisation.writeObject(new Game("Crash Bandicoot - Wrath of Cortex", 10));

            serialisation.close();

        }catch(IOException e){
            System.out.println("Erreur lors de la sérialisation de l'objet Game");
        }
    }
}
