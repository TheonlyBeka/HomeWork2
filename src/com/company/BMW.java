package com.company;

public class BMW extends Cars{

    private double engineVolume;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public BMW(String name, String color, int hp, double engineVolume) {
        super(name, color, hp);
        this.engineVolume = engineVolume;
    }

    @Override
    public void print() {
        System.out.println("Имя авто - " + getName() +
                "\nЦвет авто - " + getColor() +
                "\nКоличество лошадинных сил - " + getHp() +
                "\nОбъём дигателя - " + getEngineVolume());
    }
}
