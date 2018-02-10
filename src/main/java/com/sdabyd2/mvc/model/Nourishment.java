package com.sdabyd2.mvc.model;

public enum Nourishment {
    HUNGRY("hungry"), NOTHUNGRY("nothungry"), STARVING("starving");


    private String title;

    Nourishment(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nourishment{" +
                "title='" + title + '\'' +
                '}';
    }
}
