/*
    * Step: generate and print palindrome numbers from m-n
    * Step: Count and print number of palindrome numbers
 */
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, totalPalindromNumber = 0;

        System.out.print("Start number : ");
        m = input.nextInt();

        System.out.print("End number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            
            int temp, sum = 0, r;
            temp = i;
            
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            
            temp = i;
            
            if (temp == sum) {
                System.out.println(sum);
                totalPalindromNumber++;
            }

        }
        
        System.out.println("Total Plaindrome numbers : " + totalPalindromNumber);

    }
}
