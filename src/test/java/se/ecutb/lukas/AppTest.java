package se.ecutb.lukas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.lukas.model.*;
public class AppTest 
{
    VendingMachine vendingMachine;
    @Before
    public void arrange(){
        vendingMachine = new ImplementVM();
    }
    @Test
    public void test_add_money(){
        vendingMachine.addCurrency(100);
        vendingMachine.addCurrency(1);
        Assert.assertEquals(101, vendingMachine.getBalance());
    }
    @Test
    public void test_add_wrong_money(){
        vendingMachine.addCurrency(1);
        vendingMachine.addCurrency(3);
        vendingMachine.addCurrency(20);
        Assert.assertEquals(21, vendingMachine.getBalance());
    }

    @Test
    public void test_get_balance(){
        VendingMachine vendingMachine = new ImplementVM();
        vendingMachine.addCurrency(500);
        vendingMachine.addCurrency(100);
        int expected = 600;
        Assert.assertEquals(expected, vendingMachine.getBalance());
    }
    @Test
    public void test_examine_beverage() {
        Product beverage = new Beverage("test", "test", 10);
        String expected = "Product: test"  + "\nPrice: 10" + "\nInfo: test" + "\n";
        Assert.assertEquals(beverage.examine(), expected);
    }

    @Test
    public void test_examine_candy() {
        Product candy = new Candy("test", "test", 10);
        String expected = "Product: test"  + "\nPrice: 10" + "\nInfo: test" + "\n";
        Assert.assertEquals(candy.examine(), expected);
    }
    @Test
    public void test_examine_fruit() {
        Product fruit = new Fruit("test", "test", 10);
        String expected = "Product: test"  + "\nPrice: 10" + "\nInfo: test" + "\n";
        Assert.assertEquals(fruit.examine(), expected);
    }

    @Test
    public void test_use_fruit(){
        Product apple = new Fruit("apple", "bla", 10);
        String expected = "You eat the apple because it's healthy.";
        Assert.assertEquals(apple.use(), expected);
    }
    @Test
    public void test_use_candy(){
        Product candy = new Candy("chocolate", "sugar!!!!", 10);
        String expected = "You happily chew on the chocolate";
        Assert.assertEquals(candy.use(), expected);
    }

    @Test
    public void test_use_beverage() {
        Product beer = new Beverage("beer", "malty", 10);
        String expected = "You drink beer";
        Assert.assertEquals(beer.use(), expected);
    }

        @Test
        public void test_end_session(){
            vendingMachine.addCurrency(1000);
            int expected = 1000;
            int expectedMoneypool = 0;

            Assert.assertEquals(expected, vendingMachine.endSession());
            Assert.assertEquals(expectedMoneypool, vendingMachine.getBalance());
        }
    @Test
    public void test_get_products(){
        VendingMachine vendingMachine = new ImplementVM();
        vendingMachine.setProducts();
        int expectedLength = 7;
        Assert.assertEquals(expectedLength, vendingMachine.getProducts().length);
    }
}