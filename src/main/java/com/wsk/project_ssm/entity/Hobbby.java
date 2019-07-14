package com.wsk.project_ssm.entity;

import java.io.Serializable;

public class Hobbby implements Serializable {
    private int ig;
    private String name;

    public Hobbby(int ig, String name) {
        this.ig = ig;
        this.name = name;
    }

    public Hobbby() {
    }

    public int getIg() {
        return ig;
    }

    public void setIg(int ig) {
        this.ig = ig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobbby{" +
                "ig=" + ig +
                ", name='" + name + '\'' +
                '}';
    }
}
