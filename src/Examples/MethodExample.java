package Examples;

import java.util.Scanner;

public class MethodExample {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);


        System.out.println("Enter your name");

        String name = input.nextLine();
        String firstLetter = name.substring(0,1);




    }


}
