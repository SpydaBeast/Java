package POS;

/**
 * Created by Brien on 1/15/2017.
 */
public class Item {

    String sku, title, desc = null;
    Price price;

    public Price getPrice(){
        return price;
    }
    public void setPrice(Price price){
        this.price = price;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
    public String getDesrc (String desc){
        return desc;
    }
    public void setDesc (String desc){
        this.desc = desc;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String printStatus() {
        return  sku + "," +
                desc + "," +
                price.getCost() + "," +
                price.getCurrency()
                ;
    }
}
