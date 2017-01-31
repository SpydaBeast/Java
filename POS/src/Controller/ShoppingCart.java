package Controller;

import DataAccess.CartDataAccess;
import POS.Item;
import POS.Operator;
import POS.Transaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Brien on 1/15/2017.
 */
public class ShoppingCart {

    CartDataAccess cartDataAccess = new CartDataAccess();

    //Start shopping cart
    public  void start(){
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter [1 = add, 2 = Delete, 0 = Enter]");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    add();
                    break;
                case 2 :
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter Product sku to remove item");
                    String sku = scan.next();

                    delete(sku);
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } while (choice != 0);
    }

    private void delete(String sku) {
        cartDataAccess.delete(sku);
    }

    public void  add(){
        cartDataAccess.create();
    }
    public void checkout(){
        ArrayList<String> sku = cartDataAccess.read();

        ArrayList<Item> purchaceditems = cartDataAccess.loadItemDetails(sku);

        double total = 0;

        System.out.println("********Customer Purchased***********");

        for (Item item: purchaceditems
             ) { total = total +item.getPrice().getCost();
            System.out.println(item.printStatus());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Amount : " + total);
        System.out.println("___________________________________");

        recordTransaction(purchaceditems);
    }

    private  void recordTransaction(ArrayList<Item> purchaseditems){
        //creates transaction
        Transaction transaction = new Transaction();
        transaction.setSku(); //need method for generating sku

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        
        // ****Set date, and dataFormat methods resolved in System Class
        
         transaction.setDate(dateFormat.format(new Date()));

        
        // ****Start here resolving errors for the setSku method
        
        Operator operator = new Operator();
        operator.setSku();
        transaction.setOperator(operator);
    }

    public void checkOut() {
    }
}
