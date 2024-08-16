package oop.encap.good;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();

        my.setYear(1992);
        my.setMonth(4);
        my.setDay(8);
        my.birthInfo();

        System.out.println("------------------------------");

        my.setYear(19927);
        my.setMonth(40);
        my.setDay(80);

    }
}
