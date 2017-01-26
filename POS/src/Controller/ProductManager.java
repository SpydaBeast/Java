package Controller;

import POS.Item;
import POS.Price;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Brien on 1/15/2017.
 */
public class ProductManager {

    public static HashMap<String, Item> getAllItems(){

        HashMap<String, Item> itemHashMap = new HashMap<String, Item>();

        File InvenFile = new File("inventory.csv");

        try{
            Scanner scanner = new Scanner (InvenFile);

            while (scanner.hasNext()){
                String fileRecord = scanner.nextLine();

                String[] fileRecordSplit = fileRecord.split(",");

                //Populate item object from the split record read from the file
                Item item = new Item();
                item.setTitle(fileRecordSplit[0]);
                item.setSku(fileRecordSplit[1]);
                item.setDesc(fileRecordSplit[2]);

                //create price object to be set later into item object
                Price price = new Price();
                price.setCost(Double.parseDouble(fileRecordSplit[3]));
                price.setCurrency(fileRecordSplit[4]);

                item.setPrice(price);

                itemHashMap.put(item.getSku(), item); //key is ItemId and Value is entire item Object
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return itemHashMap;
    }
}
