package com.company.controller;

import com.company.model.Game;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Umberto on 01/11/2016.
 */
public class DeserialisationGameController {

    private ArrayList<String> gamesDeserialize = new ArrayList<>();
    private ObjectInputStream deserialisation;

    public ArrayList<String> getGamesDeserialize() {
        return gamesDeserialize;
    }

    private File file = new File("games.txt");

    int i;

    public DeserialisationGameController(){

        try{

            deserialisation = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

            gamesDeserialize.add(deserialisation.readObject().toString());

            deserialisation.close();

        }catch(ClassNotFoundException e){
            System.out.println("Objet non trouvée");
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
