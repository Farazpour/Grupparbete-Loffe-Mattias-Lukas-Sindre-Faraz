package se.ecutb.lukas;

import se.ecutb.lukas.model.ImplementVM;
import se.ecutb.lukas.model.Product;
import se.ecutb.lukas.model.VendingMachine;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean hejsan = true;
        ImplementVM implementation = new ImplementVM();

        implementation.setProducts();

        String[] arr = implementation.getProducts();
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
             }
        System.out.println("");
        //printa alternativen

        System.out.println("Add currency. Enter a number. 1, 5, 10, 20, 50, 100, 500, 1000");
        String temp = "";
        int currency = 0;
        while (currency != 1
                || currency != 5
                || currency != 10
                || currency != 20
                || currency != 50
                || currency != 100
                || currency != 500
                || currency != 1000) {
            temp = sc.nextLine();
            try {
                currency = Integer.parseInt(temp);
                implementation.addCurrency(currency);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid input. Make another input.");
            }
            if (currency != 0){
                implementation.addCurrency(currency);
                break;
            }
        }

            //sätt in pengar


        while (implementation.getBalance() > 0){
            System.out.println("Your balance is: "+implementation.getBalance());
            System.out.println("Select a ware between 0-5 where 0 is Daim and 5 Omnipollo Noah Pecan Mud Cake");

            int productNumber = -1;
            while (hejsan){
                temp = sc.nextLine();
                try{
                    productNumber = Integer.parseInt(temp);
                    String temparray[] = implementation.getProducts();

                    System.out.println("You chose: "+temparray[productNumber]);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Not a number between 0-5.");
                }
            }
            implementation.request(productNumber);
            implementation.getDescription(productNumber);
            //getprice

        }
        //välj en vara


        //ge växel och avsluta eller avsluta utan växel

    }
}
