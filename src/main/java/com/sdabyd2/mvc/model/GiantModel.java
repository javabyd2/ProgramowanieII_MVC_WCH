package com.sdabyd2.mvc.model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;
    private TypeOfAction typeOfAction;


    public GiantModel(Health health, Nourishment nourishment, Fatigue fatigue, TypeOfAction typeOfAction) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
        this.typeOfAction = typeOfAction;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }


    public TypeOfAction getTypeOfAction() {
        return typeOfAction;
    }

    public void setTypeOfAction(TypeOfAction typeOfAction) {
        this.typeOfAction = typeOfAction;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                ", typeOfAction=" + typeOfAction +
                '}';
    }
}
