package com.sdabyd2.mvc;

import com.sdabyd2.mvc.controller.GiantController;
import com.sdabyd2.mvc.model.*;
import com.sdabyd2.mvc.view.GiantView;

public class Main {
    public static void main(String[] args) {

        GiantModel giant1 = new GiantModel(Health.HEALTHY,Nourishment.NOTHUNGRY, Fatigue.NO, TypeOfAction.ATTACK);

        GiantView view = new GiantView();
        GiantController controller = new GiantController(giant1,view);

        controller.setFatigue(Fatigue.YES);
        controller.setNourishment(Nourishment.NOTHUNGRY);
        controller.updateView();

        controller.setFatigue(Fatigue.SLEEPING);
        controller.setNourishment(Nourishment.STARVING);
        controller.updateView();
    }


}
