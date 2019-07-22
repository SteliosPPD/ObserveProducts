package observeproducts;

public class ObserveProducts {

    public static void main(String[] args) {
        
        Product p1 = new Product("T-shirt", 17, "blue", "medium");
        p1.attach(new Customer("Maria Papadopoulou"));
        p1.attach(new Customer("John Smith"));
        p1.setColor("white");
        
    }
    
}
