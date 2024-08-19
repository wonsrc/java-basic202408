package oop.inter;

public class Duck extends Livings implements Huntable{
    String name;
    int age;

    public void swint() {
        System.out.println("헤엄을 치자~~");
    }

    @Override
    public void feed(String foodName) {

    }

    @Override
    public boolean speel() {
        return false;
    }

    @Override
    public void hunt(Animal animal) {

    }
}
