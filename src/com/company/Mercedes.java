package com.company;

public class Mercedes extends Cars{
    private int year;

    public Mercedes(String name, String color, int hp, int year) {
        super(name, color, hp);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Имя авто - " + getName() +
                "\nЦвет авто - " + getColor() +
                "\nКоличество лошадинных сил - " + getHp() +
                "\nГод выпуска авто - " + getYear());
    }
}
