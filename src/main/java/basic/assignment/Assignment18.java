/*
    Print the Day name

    * Step 1: Declare an array of weekdays
    * Step 2: Use will give a day number you have to print the equivalent day name
    
    * Example 1
        input -> Enter day number (1-7): 1
        output -> Monday
    * Exampmle 2
        input -> Enter day number (1-7) : 2
        output -> Wednesday
        
 */
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter day number (1-7): ");

        int dayNumber = input.nextInt();
        String dayName = "";

        if (dayNumber < 1 && dayNumber > 7) {
            System.out.println("Please enter day number (1-7)");
        } else {
            for (int i = 0; i < weeks.length; i++) {

                if (i == dayNumber - 1) {
//                    dayName = weeks[i];
                    System.out.println(weeks[i]);
                }
            }
//            System.out.println(dayName);
        }
        
    }

}
