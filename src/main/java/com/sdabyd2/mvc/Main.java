package com.sdabyd2.mvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdabyd2.mvc.controller.GiantController;
import com.sdabyd2.mvc.model.*;
import com.sdabyd2.mvc.view.GiantView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        GiantModel giant1 = new GiantModel(Health.HEALTHY, Nourishment.NOTHUNGRY, Fatigue.NO, TypeOfAction.ATTACK);
        GiantModel giant2 = new GiantModel(Health.HEALTHY, Nourishment.NOTHUNGRY, Fatigue.NO, TypeOfAction.STAND);

        List<GiantModel> creatures = new ArrayList<>();

        creatures.add(giant1);
        creatures.add(giant2);

        GiantView view = new GiantView();
        GiantController controller = new GiantController(creatures, view);

        controller.getHealth(0);

        controller.setFatigue(Fatigue.YES, 0);
        controller.setNourishment(Nourishment.NOTHUNGRY, 0);
        controller.updateView();

        // Zapis do JSON
        ObjectMapper mapper = new ObjectMapper();
        File filename = new File("giant.json");
        filename.createNewFile();
        mapper.writeValue(filename, creatures);

        // Odczyt z JSON
        List<GiantModel> lista =
                mapper.readValue(new File("giant.json"),
                        mapper.getTypeFactory().constructCollectionType(List.class,GiantModel.class));




    }
}
