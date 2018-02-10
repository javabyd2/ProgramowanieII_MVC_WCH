package com.sdabyd2.mvc.controller;

import com.sdabyd2.mvc.model.*;
import com.sdabyd2.mvc.view.GiantView;

import java.util.List;

public class GiantController {
    public GiantController() {
    }

    private List<GiantModel> monsters;

    public List<GiantModel> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<GiantModel> monsters) {
        this.monsters = monsters;
    }

    private GiantView giantView;
    private  int id;

    public GiantController(List<GiantModel> monsters, int id) {
        this.monsters = monsters;
        this.id = id;
    }

    public GiantController(List<GiantModel> giantModel, GiantView giantView) {
        this.monsters = giantModel;
        this.giantView = giantView;
    }



    public Health getHealth(int gh) {
        return monsters.get(gh).getHealth();
    }

    public void setHealth(Health health, int i) {
        this.monsters.get(i).setHealth(health);
    }

    public Fatigue getFatigue(int gf) {
        return monsters.get(gf).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int i) {
        this.monsters.get(i).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int gN) {
        return monsters.get(gN).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int i) {
        this.monsters.get(i).setNourishment(nourishment);
    }

    public void updateView() {
        this.giantView.displayGiant(monsters);
    }

    public TypeOfAction getTypeOfAction(int gta) {
        return monsters.get(gta).getTypeOfAction();
    }

    public void setTypeOfAction(TypeOfAction typeOfAction, int i) {
        this.monsters.get(i).setTypeOfAction(typeOfAction);
    }
}
