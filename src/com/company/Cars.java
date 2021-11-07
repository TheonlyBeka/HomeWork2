package com.company;

public abstract class Cars implements Printable{
    private String name;
    private String color;
    private int hp;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    public Cars(String name, String color, int hp) {
        this.name = name;
        this.color = color;
        this.hp = hp;
    }
}
