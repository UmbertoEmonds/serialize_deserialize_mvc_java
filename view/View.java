package com.company.view;

import com.company.controller.DeserialisationGameController;
import com.company.controller.SerialisationGameController;

/**
 * Created by Umberto on 01/11/2016.
 */
public class View {

    SerialisationGameController serialisationGameController = new SerialisationGameController();
    DeserialisationGameController deserialisationGameController = new DeserialisationGameController();

    public View(){

        for (int i = 0; i<deserialisationGameController.getGamesDeserialize().size(); i++){
            System.out.println(deserialisationGameController.getGamesDeserialize().get(i));
        }

    }

}
