package Examples;

import java.util.Scanner;

public class HomeTaskRandom {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        String userName= "test";
        String password= "test123";


        System.out.println("Please enter your username and password :");

        String n=input.nextLine();
        if(!userName.equals(n)){
            System.out.println("invalid name");
        }
        String p=input.nextLine();
        if(userName.equals(n) && password.equals(p)){
            System.out.println("Welcome");
        }
        else if (!password.equals(p)) {
            System.out.println("invalid password");
        }


        }





    }



