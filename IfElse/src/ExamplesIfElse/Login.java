package ExamplesIfElse;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username1 = "mary";
        int password1 = 123456;


        System.out.println("Enter username:");
        String username = input.nextLine();

        if (username1 == username) {

            System.out.println("Enter password:");
            int password = input.nextInt();
            if (password1 == password) {
                System.out.println("Login successful");
            } else {
                System.out.println(" Wrong password");
            }


        }
    }


}