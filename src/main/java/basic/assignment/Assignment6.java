/* 
    * Digit spelling program using if, else if, else
    * step 1: ask for a digit between 0-9
    * step 2: check the digit and pring it by spelling. example if user input is 0 the print 'Zero'
    * step 3: if the digit is not amon 0-9 then print Invalid digit
*/


package basic.assignment;

import java.util.Scanner;


public class Assignment6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String zero = "Zero";
        String one = "One";
        String two = "Two";
        String three = "Three";
        String four = "Four";
        String five = "Five";
        String six = "Six";
        String seven = "Seven";
        String eight = "Eight";
        String nine = "Nine";
        
        int num;
        
        System.out.print("Enter any int number 0-9 range : ");
        num = input.nextInt();
        
        if(num == 0){
            System.out.println("Your Enter number is : " + zero);
        }else if (num == 1){
            System.out.println("Your Enter number is : " + one);
        }else if (num == 2){
            System.out.println("Your Enter number is : " + two);
        }else if (num == 3){
            System.out.println("Your Enter number is : " + three);
        }else if (num == 4){
            System.out.println("Your Enter number is : " + four);
        }else if (num == 5){
            System.out.println("Your Enter number is : " + five);
        }else if (num == 6){
            System.out.println("Your Enter number is : " + six);
        }else if (num == 7){
            System.out.println("Your Enter number is : " + seven);
        }else if (num == 8){
            System.out.println("Your Enter number is : " + eight);
        }else if (num == 9){
            System.out.println("Your Enter number is : " + nine);
        }else{
            System.out.println("Your number is not among 0-9, Invalid digit");
        }
        
        
    }
}
