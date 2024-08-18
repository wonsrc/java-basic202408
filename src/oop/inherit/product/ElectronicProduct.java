package oop.inherit.product;

import java.util.function.DoubleFunction;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacture;

    public ElectronicProduct(String productName, double price, String manufacture) {
        this.productName = productName;
        this.price = price;
        this.manufacture = manufacture;
    }

    public void displayInfo() {
        System.out.printf("%s, 가격: %f원, 제조사 %s\n",this.productName, this.price, this.manufacture);
    }

}
