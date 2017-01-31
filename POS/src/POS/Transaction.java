package POS;

/**
 * Created by Brien on 1/15/2017.
 */
public class Transaction {

    private String sku;
    private Operator operator;
    private System system;
    private Customer customer;
    private String date;
    private Item[] items;

    public String getDate(){
        return date;
    }
    public void setDate (String date){
        this.date = date;
    }
    public Item[] getItems(){
        return items;
    }
    public void setItems(Item[] items){
        this.items = items;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(){
        this.sku = sku;
    }
   public Operator getOperator(){
        return operator;
   }
    public void setOperator(Operator operator) {
       this.operator = operator;
    }
    public System getSystem(){
        return system;
    }
    public void setSystem(){
        this.system = system;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer (Customer customer){
        this.customer = customer;
    }

    //create machine, customer, item objects store in variables.

}
