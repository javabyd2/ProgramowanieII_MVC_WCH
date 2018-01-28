package com.sdabyd2.mvc.model;

public enum TypeOfAction {

    ATTACK("attack"), STAND("stand"), RUN("run away");

    private String title;

    TypeOfAction(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TypeOfAction{" +
                "title='" + title + '\'' +
                '}';
    }
}
