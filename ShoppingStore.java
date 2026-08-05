
// interface Camera { 
//     void takePhoto(); 
//     void recordVideo(); 
// } 

// interface MusicPlayer { 
//     void playMusic(); 
//     void stopMusic(); 
// } 

// class Smartphone implements Camera, MusicPlayer { 
//     @Override 
//     public void takePhoto() { 
//         System.out.println("Photo captured ."); 
//     } 

//     @Override 
//     public void recordVideo() { 
//         System.out.println("Video recording started."); 
//     } 

//     @Override 
//     public void playMusic() { 
//         System.out.println("Playing music"); 
//     } 

//     @Override 
//     public void stopMusic() { 
//         System.out.println("Music stopped."); 
//     } 
// } 

// public class ShoppingStore { 
//     public static void main(String[] args) { 
//         Smartphone phone = new Smartphone(); 
//         phone.takePhoto(); 
//         phone.recordVideo(); 
//         phone.playMusic(); 
//         phone.stopMusic(); 
//     } 
// }




//.....................................................................................................................





import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

 
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;

     
        if (price >= 0)
            this.price = price;
        else
            this.price = 0;

        if (quantity >= 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public double calculateTotal() {
        return price * quantity;
    }

  
    public void display() {
        System.out.println("Product Details");

        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Bill   : " + calculateTotal());
    }
}

public class ShoppingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product p = new Product(id, name, price, quantity);

        p.display();

        sc.close();
    }
}
