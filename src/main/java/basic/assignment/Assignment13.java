//find nth fibonacci number
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which fibonacci number you want to see? ");
        int n = input.nextInt();
       
        
        System.out.println("Fibonacci series limit: ");
        int l = input.nextInt();
        
        int first = 0, second = 1, fibo;

        if (n == 1) {
            System.out.println("Series number is: " + first);

        } else if (n == 2) {
            System.out.println("Series number is: " + second);
            
        } else {
            for (int i = 3; i <= l; i++) {
                fibo = first + second;
                if(i == n){
                    System.out.println("Series number is: " + fibo);
                }
                first = second;
                second = fibo;
            }
        }

    }

}
