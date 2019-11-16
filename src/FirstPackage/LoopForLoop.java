package FirstPackage;

import java.util.Scanner;

public class LoopForLoop {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Please enter your password :");
            String password = input.nextLine();
            String pass = "secret478";

            if (password.equals(pass)) {
                System.out.println("Welcome to your profile !");
                break;
            }
        }

        for (int attempts = 0 ; ; attempts++) {
            System.out.println("Please enter your password :");
            String password = input.nextLine();
            String pass = "secret478";
            if (attempts == 3) {
                System.out.println("Your account is locked");
                break;
            }


        }
    }
}