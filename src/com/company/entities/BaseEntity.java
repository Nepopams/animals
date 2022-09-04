package com.company.entities;

public abstract class BaseEntity {


    protected int health;
    protected int weight;
    protected static int index = 0;
    protected String name;
    protected boolean isAlive;

    public abstract String getKind();


    public String getName() {
        return name;
    }

    public BaseEntity() {
        name = getKind() + ++index;
        isAlive = true;
    }

    public void die() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getFood() {
        return weight / 3;
    }
}
