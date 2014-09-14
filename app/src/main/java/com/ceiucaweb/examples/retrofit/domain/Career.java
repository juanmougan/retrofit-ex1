package com.ceiucaweb.examples.retrofit.domain;

/**
 * POJO que representa una Carrera de la facultad
 * Created by juanma on 12/09/14.
 */
public class Career {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Career() {
    }
}
