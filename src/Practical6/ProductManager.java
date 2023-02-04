import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProductManager {
    public void saveProduct(Product p) {
        File f = new File("product.dat");

        try {
            FileOutputStream fos = new FileOutputStream(f); 
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(p);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Product loadProduct() {
        Product p = null;
        
        try {
            File f = new File("product.dat");
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(f));
            p = (Product) inStream.readObject();
            
            inStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return p;
    }
    public static void main(String[] args) {
        Product myProduct = new Product("005", 199);
        ProductManager pm = new ProductManager();
        pm.saveProduct(myProduct);

        Product p = pm.loadProduct();
        if(p != null){
         System.out.println("Code:\t" + p.getCode());
         System.out.println("Price:\t" + p.getPrice());
    }
}}
