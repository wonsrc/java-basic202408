package oop.inter;

public class Bear extends Livings implements BadAnimal{

    String name;
    int age;

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

    @Override
    public void angry() {

    }

    @Override
    public void fight() {

    }
}
