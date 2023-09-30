/*
   Logical and assignment
    Check eligible candidate
    * step 1: Ask  the candidate have you completed your masters? y/n
    * step 2: Ask the candidate are you fulent in English? y/n
    * step 3: if the candidate has passed masters and also have fluent english skill then
    * step 4: else print Sorry, you are not eligible to for the job interview
*/

package basic.assignment;

import java.util.Scanner;

public class Assignment8 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char master;
        char english;
        
        
        System.out.print("Are you completed your masters? y/n: ");
        master = input.next().charAt(0);
        
        System.out.print("Are you fulent in English? y/n: ");
        english = input.next().charAt(0);
        
        if(master == 'y' && english == 'y'){
            System.out.println("You are eligible to for the job interview");
        }
        else{
            System.out.println("Sorry, you are not eligible to for the job interview");
        }
        
        
        
    }
}
