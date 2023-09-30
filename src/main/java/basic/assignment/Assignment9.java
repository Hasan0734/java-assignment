package basic.assignment;
import java.util.Scanner;

// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
public class Assignment9 {
  public static void main(String[] args) {
    // get the OPTION from user
    // use switch, case, break and default

    // Selected language is Bengali
    // Selected language is Hindi
    // Selected language is Urdu
    // Selected language is English
    
    
    Scanner input = new Scanner(System.in);
       int option;
       
       System.out.print("Enter your language option: " );
       option = input.nextInt();
       
       

       switch(option){
           case 1:
               System.out.println("Selected language is Bengali");
               break;
           case 2:
               System.out.println("Selected language is Hindi");
               break;
           case 3:
               System.out.println("Selected language is Urdu");
               break;
           case 4:
               System.out.println("Selected language is English");
               break;
           default:
               System.out.println("Invalid");
                
       }
    
  }
}