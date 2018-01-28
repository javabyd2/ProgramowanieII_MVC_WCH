package com.sdabyd2.mvc.controller;

import com.sdabyd2.mvc.model.*;
import com.sdabyd2.mvc.view.GiantView;

public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth() {
        return giantModel.getHealth();
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue() {
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
        this.giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return giantModel.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
        this.giantModel.setNourishment(nourishment);
    }

    public void updateView(){
        this.giantView.displayGiant(giantModel);
    }

    public TypeOfAction getTypeOfAction(){
        return giantModel.getTypeOfAction();
    }

    public void setTypeOfAction(TypeOfAction typeOfAction){
        this.giantModel.setTypeOfAction(typeOfAction);
    }
}
