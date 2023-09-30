/*
   Logical or assignment
    * step 1: Print "Do you love java?"
    * step 2: take user input y / Y / n / N
    * step 3: if user input y / Y then print you are a java lover
    * step 4: if user input n / N then print you are not a java lover
*/


package basic.assignment;

import java.util.Scanner;

public class Assignment7 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userInput;
        
        System.out.print("Do you love java? ");
        userInput = input.next().charAt(0);
        
        if(userInput == 'y' || userInput == 'Y'){
            System.out.println("You are a java lover");
        }
        else if(userInput == 'n' || userInput == 'N'){
            System.out.println("You are not a java lover");
        }
        
    }
}
