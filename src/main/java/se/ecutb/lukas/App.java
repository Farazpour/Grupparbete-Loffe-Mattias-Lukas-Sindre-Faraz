package se.ecutb.lukas;

import se.ecutb.lukas.model.ImplementVM;
import se.ecutb.lukas.model.Product;
import se.ecutb.lukas.model.VendingMachine;

public class App
{
    public static void main( String[] args )
    {
        ImplementVM implementation = new ImplementVM();
        implementation.setProducts();
        String[] arr = implementation.getProducts();
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
             }

        implementation.addCurrency(10);
        implementation.request(0);
        System.out.println(implementation.getBalance());
            //sätt in pengar
        //välj en vara
        //välj en till?
        //ge växel och avsluta eller avsluta utan växel

    }
}
