/* 
    * Assignment-3 (User Input)
    * step 1: create a class called prduct
    * step 2: create a main method
    * step 3: declare variables: id, title, price, description, category
    * step 4: get user input fro each variables
    * step 5: print the variables
*/


package basic.assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main (String[] args){
        
        Scanner inputId = new Scanner(System.in);
        Scanner inputTitle = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        Scanner inputDescription = new Scanner(System.in);
        Scanner inputCategory = new Scanner(System.in);
        
          byte id;
          String title;
          int price;
          String description;
          String category;
          
          System.out.println("Enter Product Id: ");
          id = inputId.nextByte();
          
          System.out.println("Enter Product title: ");
          title = inputTitle.nextLine();
          
          System.out.println("Enter Product Price: ");
          price = inputPrice.nextInt();
          
          System.out.println("Enter Product Description: ");
          description = inputDescription.nextLine();
          
          System.out.println("Enter Product category: ");
          category = inputCategory.nextLine();
          
          
          
        
        System.out.println("id: "+id);
        System.out.println("title: "+title);
        System.out.println("price: "+price);
        System.out.println("description: "+description);
        System.out.println("category: "+category);
    }
}
