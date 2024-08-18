package oop.inherit.product;

public class Smartphone extends ElectronicProduct{

    int storageCapacity;

    public Smartphone(String productName, double price, String manufacture, int storageCapacity) {
        super(productName, price, manufacture);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("저장 용량: % d GB\n", this.storageCapacity);
    }
}
