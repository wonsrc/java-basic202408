package oop.poly.car;

public class CarShop{
    /*

     */
    public void carPirce(Car c) {
        if(c instanceof Sonata) {
            System.out.println("소나타의 가격은 3천만원 입니다.");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 8천만원 입니다.");
        } else if ( c instanceof Porsche) {
            System.out.println("포르쉐의 가격은 1.5억 입니다.");
        }
    }

}
