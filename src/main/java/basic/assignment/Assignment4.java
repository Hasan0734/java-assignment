//create a program to calculate installment amount for per month


package basic.assignment;
import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment4 {
    
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){
            int phonePrice = 1800; //1800 euros
            int numberOfInstallment, installmentPerMonth;
            
            System.out.print("Number of installments? ");
            //get number of installmetns from user
               numberOfInstallment  = input.nextInt();
               
            //calculate installment amount of per month
            
            installmentPerMonth =  phonePrice / numberOfInstallment;
            
            
            System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");
                    
        }
    }
    
}
