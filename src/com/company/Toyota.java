package com.company;

public class Toyota extends Cars{

    private String engine;

    public Toyota (String name, String color, int hp, String engine) {
        super(name, color, hp);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void print() {
        System.out.println("Имя авто - " + getName() +
                "\nЦвет авто - " + getColor() +
                "\nКоличество лошадинных сил - " + getHp() +
                "\nДвигатель - " + getEngine());
    }
}
