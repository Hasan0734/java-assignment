/*
    * Step 1: Generate and print armstrong numbers from m-n
    * Step 2: Count and print number of armstrong numbers
 */
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, totalArmstrongNumber = 0;

        System.out.print("Start Number : ");
        m = input.nextInt();

        System.out.print("End number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            int temp, sum = 0, r;

            temp = i;

            while (temp != 0) {

                r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }

            temp = i;

            if(temp == sum){
                System.out.println(sum);
                totalArmstrongNumber++;
            }
        }

        System.out.println("Total armstrong numbers : " + totalArmstrongNumber);
    }
}
