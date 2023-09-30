
//find factrial of n
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 1;
        int fact = 1;
        
        System.out.print("Enter your number = ");
        
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
              fact = fact * i;
        }
        
//        for( num; num == 1; num--){
//            
//            fact = fact * num;
//        }
        
        System.out.println(num + " Factorial num is = " + fact);
        
        
    }
}
