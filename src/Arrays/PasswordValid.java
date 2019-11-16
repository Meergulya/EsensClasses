package Arrays;

import java.util.Scanner;

public class PasswordValid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String password = input.nextLine();


        for (int i = 0; i <= password.length(); i++) {

            if (password.length() < 8) {
                System.out.println("Password should contain minimum 8 characters");
            break;
            }
               if ((password.charAt(i) > 65) && (password.charAt(i) < 90)) {
                System.out.println("Password should contain at least 1 uppercase letter");

            }
               if ((password.charAt(i) > 97) && (password.charAt(i) < 122)) {
                        System.out.println("Contain at least one lowercase letter");

                    }
               if ((password.length() > 48) && (password.length() < 57)) {
                            System.out.println("Password should contain at least 1 digit ");
                     }
               if ((password.length() > 32) && (password.length() < 47)) {
                                System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.");

                            } else  {
                                System.out.println("Your password is accepted");
                            }

        }


    }


}
