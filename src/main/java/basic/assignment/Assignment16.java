/*
    // validate user based on username and password
    // input username and password until username == "anis" and password = "123456"
    // if username and password does not match print "username/password is incorrect
    // if username and password match print "Welcom to the system"
 */
package basic.assignment;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class Assignment16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        boolean temp = true;

        while (temp) {
            
            System.out.print("Enter your username : ");
            username = input.next();

            System.out.print("Enter your password : ");
            password = input.next();
      
            
         

            if (username.equals("anis") && password.equals("12345")) {
               
                System.out.println("Welcom to the system");
                temp = false;
           
            } else {
                System.out.println("username/password is incorrect");

            }
        }

    }

}
