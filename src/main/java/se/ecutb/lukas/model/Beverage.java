package se.ecutb.lukas.model;

public class Beverage extends Product{
    public Beverage(String name, String productInfo, int price) {
        super(name, productInfo, price);
    }

    @Override
    public String use(){
        return "You drink " + getName();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
