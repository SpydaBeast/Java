package DataAccess;

import Controller.ProductManager;
import POS.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Brien on 1/25/2017.
 */
public class CartDataAccess {
    //Loads item(s) into memory with ArrayList
    static ArrayList<String> skuIdList = new ArrayList<String>();

    //Add item ID
    public void create() {
        Scanner scanner = new Scanner(System.in);
        String sku = "0";

        do {
            System.out.println("Enter Sku, [0 = Exit] : ");
            sku = scanner.next();

            if (!sku.equals("0")) {
                skuIdList.add(sku);
            }

        } while (!sku.equals("0"));
    }

    public ArrayList<String> read() {
        return skuIdList;
    }

    public void update() {
    }

    public void delete(String sku) {
        skuIdList.remove(sku);
    }

    public ArrayList<Item> loadItemDetails (ArrayList<String> sku ) {


        ArrayList<Item> purchasedItemList = new ArrayList<Item>();

        //reads all items from map

        ProductManager productManager = new ProductManager();
        HashMap<String, Item> allItems = productManager.getAllItems();

        for (int i = 0; i < sku.size(); i++) {
            purchasedItemList.add(allItems.get(sku.get(i)));
        }
        return purchasedItemList;
    }
}
