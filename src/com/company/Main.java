package com.company;

class Shape {
    private String name;
    private int lenght;

    Shape (String name, int lenght){
        this.name=name;
        this.lenght=lenght;
    }
    public int getLenght() {
        return lenght;
    }
    @Override
    public String toString() {
        return this.name+" , "+getLenght()+ "см";
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Прямоугольник", 100);
        System.out.println(shape);
    }
}
