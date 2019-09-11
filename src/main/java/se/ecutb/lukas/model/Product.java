package se.ecutb.lukas.model;

public abstract class Product {

    public String name;
    public String productInfo;
    public int price;

    public Product(String name, String productInfo, int price) {
        this.name = name;
        this.productInfo = productInfo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String examine(int index){
        return "Product: " + getName() + "\nPrice: " + getPrice() + "\nInfo: " + getProductInfo() + "\n";
    }

    public String use(int index){
        return "You happily chew on the " + getName();
    }

    @Override
    public String toString() {
        return "Product: "+ name + ".   Product info: " + productInfo + ".   Price: " + price;
    }
}
