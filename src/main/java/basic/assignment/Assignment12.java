//print sum of odd numbers from m-n

package basic.assignment;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int startingNum, endingNum;
            int sum = 0;
            
            System.out.print("Enter your start number and end number = ");
            
            startingNum = input.nextInt();
            endingNum = input.nextInt();
            
            for (int i = startingNum; i <= endingNum; i++) {
                
                if(i % 2 != 0){
                    
                 sum = sum + i;
                }
            }

            System.out.println("Youd odd number sum of : " + sum);
                     
    }
    
}
