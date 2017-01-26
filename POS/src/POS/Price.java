package POS;

/**
 * Created by Brien on 1/15/2017.
 */
public class Price {

    private Double cost = 0.0;
    private String currency;

    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public  String getCurrency(){
        return currency;
    }
    public  void setCurrency(String currency){
        this.currency = currency;
    }
}
