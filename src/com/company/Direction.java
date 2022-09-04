package com.company;

public enum Direction {



    UP("Вверх"),
    DOWN("Вниз"),
    LEFT("Влево"),
    RIGHT("Вправо"),
    HOLD("Не двигаться");

    private String direction;
    private Direction(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString(){
        return direction;
    }
}
