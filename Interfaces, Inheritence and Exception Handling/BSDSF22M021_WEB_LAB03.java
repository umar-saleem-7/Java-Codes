import java.util.*;

interface Product {
    abstract double calculatePrice();
    abstract String getDetails();
    boolean isAvailable();
}

class BaseProduct implements Product{

    protected String name;
    protected double price;
    protected int stock;

    public BaseProduct(String name, double price, int stock){
        try {
            if (price < 0 || stock < 0) {
                throw new IllegalArgumentException("Price and Stock must not be negative!");
            }
            this.name = name;
            this.price = price;
            this.stock = stock;
        } catch (IllegalArgumentException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        } finally {
            System.out.println("Product Processing Complete");
        }
    }

    public String getDetails(){
        return "Product Details:\n---------------------------\n" +
               "Product Name: " + name + "\n" +
               "Price ($): " + price + "\n" +
               "Quantity in Stock: " + stock;
    }

    public double calculatePrice(){
        return price;
    }

    public boolean isAvailable(){
        return stock > 0;
    }

}


class Electronics extends BaseProduct{

    private int warranty;

    public Electronics(String name, double price, int stock, int warranty){
        super(name, price, stock);
        this.warranty = warranty;
    }

    public double calculatePrice(){
        if (price > 1000) {
            price *= 0.9;
        }
        return price;
    }

    public String getDetails(){
        super.getDetails();
        return super.getDetails() + "\nWarranty: " + warranty + " months";
    }
}

class Clothing extends BaseProduct{

    private String size;
    private String material;

    Clothing(String name, double price, int stock, String size, String material){
        super(name, price, stock);
        this.size = size;
        this.material = material;
    }

    public double calculatePrice(){
        if (stock < 5){
            price *= 0.95;
        }
        return price;
    }

    public String getDetails(){
        return super.getDetails() + "\nSize: " + size + "\nMaterial: " + material;
    }
}

class Groceries extends BaseProduct{

    private String expirationdate;
    private int quantitybuy;

    Groceries(String name, double price, int stock, String expirationdate, int quantitybuy){
        super(name, price, stock);
        this.expirationdate = expirationdate;
        this.quantitybuy = quantitybuy;
    }

    public double calculatePrice(){
        if (quantitybuy > 5){
            price *= 0.92;
        }
        return price;
    }

    public String getDetails(){
        return super.getDetails() + "\nExpiration Date: " + expirationdate + "\nQuantity Buy: " + quantitybuy;
    }

}

class Books extends BaseProduct{

    private String authorname;

    Books(String name, double price, int stock, String authorname){
        super(name, price, stock);
        this.authorname = authorname;
    }

    public double calculatePrice(){
        if (price > 50) {
            price *= 0.93;
        }
        return price;
    }

    public String getDetails(){
        return super.getDetails() + "\nAuthor Name: " + authorname;
    }
}

public class BSDSF22M021_WEB_LAB03{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Select a Product Type from the following: \n1. Electronics\n2. Clothing\n3. Groceries\n4. Books");
        System.out.print("\n Enter Choice: ");
        int choice = in.nextInt();
        in.nextLine();
        
        Product product = null;

        System.out.println("Enter Product Details: \n---------------------------");
        System.out.print("Enter Product Name: ");
        String name = in.nextLine();
        System.out.print("Enter price: ");
        double price = in.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int stock = in.nextInt();
        in.nextLine();

        if (choice == 1){
            System.out.print("Enter warranty: ");
            int warranty = in.nextInt();
            product = new Electronics(name, price, stock, warranty);
        } else if (choice == 2){
            System.out.print("Enter Size (S, M, L, XL, XXL): ");
            String size = in.nextLine();
            System.out.print("Enter material (cotton, polyster etc): ");
            String material = in.nextLine();
            product = new Clothing(name, price, stock, size, material);
        } else if (choice == 3){
            System.out.print("Enter Expiration Date: ");
            String expirationdate = in.nextLine();
            System.out.print("Enter Quantity Buy: ");
            int quantitybuy = in.nextInt();
            product = new Groceries(name, price, stock, expirationdate, quantitybuy);
        } else if (choice == 4){
            System.out.print("Enter Author name: ");
            String authorname = in.nextLine();
            product = new Books(name, price, stock, authorname);
        } else{
            System.out.print("Invalid Choice!");
        }

        if (product != null){
            System.out.println("\n---------------------------");
            System.out.println(product.getDetails());
            if (product.isAvailable()){
                System.out.println("Final Price after discount: $" + product.calculatePrice());
            }
            else{
                System.out.println("Product Out of Stock!");
            }
        }
    }
}