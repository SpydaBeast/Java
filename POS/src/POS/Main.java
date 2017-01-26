package POS;

import Controller.ProductManager;
import Controller.ShoppingCart;

import java.lang.*;
import java.lang.System;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Items list
        ProductManager itemManager = new ProductManager();
        HashMap<String, Item> itemMap = ProductManager.getAllItems();

        Iterator<String> iterator = itemMap.keySet().iterator();

        System.out.println("List of available items [Item#, Description, Price, Currency]");

        while (iterator.hasNext()){
            Item item = itemMap.get((iterator.next()));
            System.out.println(item.printStatus());
        }
        System.out.println("----------------------------------------");

        ShoppingCart cart = new ShoppingCart();
        cart.start();

        // **** create a checkout method call with intellij suggestion. The call was created in Shopping cart
        cart.checkOut();

        System.out.println("Thank you for Shopping with us");


    }
}
