import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private double price;
    public Product(String s, double p){
        code = s;
        price = p; 
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
