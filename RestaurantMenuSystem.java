import java.util.Scanner;

public class RestaurantMenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "Pizza, Burger, Pasta, Sandwich, Momos, French Fries, Garlic Bread, Noodles, Spring Rolls, Cold Coffee";

        // 1. Display the complete menu.
       // 2. Print the menu in uppercase and then in lowercase.
       // 3. Add a new food item (Fries) to the end of the menu.
       //4. Find the position of the food item Pasta in the menu.
        // 5. Replace Burger with Wrap.
         // 6. Extract only the word Sandwich from the menu.
          // 7. Display the first five characters of the menu.
        // 8. Split the menu into individual food items and print each item on a new line.
        // 9. Compare the strings "Pizza" and "pizza" using ==, equals(), and equalsIgnoreCase().
         // 10. Compare "Pizza" and "Pasta" using compareTo() and explain the result.
          // 11. Convert the integer value 299 (Today's Special Price) into a String using String.valueOf() and display it with a proper message.
          // 12. Count and display the total number of food items available in the menu.
         // 13. Ask the user to enter the name of a food item and check whether it is available in the menu using contains(). Display an appropriate message based on the result.
          // 14. Finally, display the updated menu after all the modifications.
        System.out.println(" Complete Menu = "+menu);
            System.out.println();
     
        System.out.println("Uppercase: " + menu.toUpperCase());
        System.out.println("Lowercase: " + menu.toLowerCase());
            System.out.println();
      
       
        menu = menu + ", Fries";
        System.out.println(" Menu after addding Fries: " + menu);
        System.out.println();

        
        int pastaIndex = menu.indexOf("Pasta");
        System.out.println("The index position of Pasta : " + pastaIndex);
        System.out.println();

    
  
        menu = menu.replace("Burger", "Wrap");
        System.out.println("New  Menu after replacement : " + menu);
        System.out.println();

        // 6. Extract only the word Sandwich from the menu.

    
        int startindex = menu.indexOf("Sandwich");
        int lastindex= startindex + "Sandwich".length();
        String Word = menu.substring(startindex, lastindex);
        System.out.println("Extracted Word: " +Word);
        System.out.println();

        


        String Five = menu.substring(0, 5);
        System.out.println("First 5 chars: " + Five);
        System.out.println();



        String[] items = menu.split(", ");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println();

        String str1 = "Pizza";
        String str2 = "pizza";
        
        System.out.println("Using ==: " + (str1 == str2));  //compare ref.
    
        System.out.println("Using equals(): " + str1.equals(str2));//compare values
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));// ignore uppercase and lowercase only compare real value
        System.out.println();


       
        int compareResult = "Pizza".compareTo("Pasta");//compare ASCII values give only (+ve,0,-ve) 
        System.out.println("Result : " + compareResult);
        System.out.println();

    
        int priceInt = 299;
        String priceStr = String.valueOf(priceInt);
        System.out.println("Today's Special Price: Rs. " + priceStr);
        System.out.println();


        System.out.println("Total food items: " + items.length);
        System.out.println();

    
      
        System.out.print("Enter a food item : ");
        String Input = sc.nextLine();
        System.out.println();
        
        if (menu.contains(Input)) {
            System.out.println( Input + "' is available.");
        } else {
            System.out.println( Input + "' is not available.");
        }
        System.out.println();
        System.out.print("Finally , List of food items after performing operations: ");
        System.out.println(menu);
        
    }
}