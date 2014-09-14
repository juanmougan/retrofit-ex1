package com.ceiucaweb.examples.retrofit.domain;

/**
 * POJO que representa una Materia de la facultad
 * Created by juanma on 12/09/14.
 */
public class Materia {

    private long id;

    public String getName() {
        return name;
    }


    public Materia() {
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Career carrera;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
