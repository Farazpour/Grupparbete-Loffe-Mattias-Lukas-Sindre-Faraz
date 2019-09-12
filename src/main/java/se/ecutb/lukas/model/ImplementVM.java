package se.ecutb.lukas.model;

public class ImplementVM implements VendingMachine{
    Product[] products = new Product[6];

    int beforeDeposit = 0;
    int balance = 0;

    @Override
    public void addCurrency(int amount) {
        int[] validMoney = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
        for (int i = 0; i < validMoney.length; i++) {
            if (amount == validMoney[i]) {
                balance = balance + validMoney[i];
                System.out.println(validMoney[i] + " kr added.");
                beforeDeposit = balance;
                break;
            }
        }
        if(beforeDeposit == 0){
            System.out.println("No money added");
        }
    }

    @Override
    public Product request(int productNumber) {
        if (balance >= products[productNumber].getPrice()){
            System.out.println("You bought: "+products[productNumber]);
        } else if (balance < products[productNumber].getPrice()){
            System.out.println("You dont have enough money. ");
        }  //try&catch?
        return products[productNumber];
    }

    @Override
    public int endSession() {
        System.out.println("You get " + balance + " back from the machine.");
        balance = 0;
        return balance;
    }

    @Override
    public String getDescription(int productNumber) {
        String[] temp = getProducts();
        System.out.println(temp[productNumber]);
        return temp[productNumber];
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String[] getProducts() {
        String[] returnProduct = new String[6];
        returnProduct[0] = products[0].toString();
        returnProduct[1] = products[1].toString();
        returnProduct[2] = products[2].toString();
        returnProduct[3] = products[3].toString();
        returnProduct[4] = products[4].toString();
        returnProduct[5] = products[5].toString();
        return returnProduct;
    }


    @Override
    public void setProducts() {
        products[0] = new Candy("Daim", "Gott me en massa choklad i", 20);
        products[1] = new Candy("Mars", "blah blah", 25);
        products[2] = new Fruit("Banana", "Brownish", 2);
        products[3] = new Fruit("Apple", "Is a fruit and nothin else", 3);
        products[4] = new Beverage("Guinness", "ABV 4.5%", 30);
        products[5] = new Beverage("Omnipollo Noah Pecan Mud Cake", "ABV 11%", 50);
    }

}
