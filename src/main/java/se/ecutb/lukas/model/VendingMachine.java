package se.ecutb.lukas.model;
import java.util.Scanner;
public interface VendingMachine {
    /*
Ett interface VendingMachine ska skapas som definierar följande metoder:
void addCurrency (int amount) - Lägga till i insättningspoolen (moneyPool).
Product request (int productNumber) - Köpa en Product.
int endSession () Ge tillbaka växel och nollställer insättningspoolen.
String getDescription (int productNumber) – Se en produktbeskrivning.
Int getBalance () – Returnerar insättningspoolen.
String [] getProducts () – returnerar alla Produkters namn och produktnummer
void addCurrency (int amount) - Lägga till i insättningspoolen (moneyPool).
 */
    Scanner sc = new Scanner(System.in);

    void addCurrency(int amount);
    Product request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();
    void setProducts();
    //getPrice?
}
