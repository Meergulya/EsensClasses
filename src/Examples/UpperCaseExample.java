package Examples;

import java.util.Scanner;

public class UpperCaseExample {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String sen=input.nextLine();
        int space = sen.indexOf(" ");
        String firstWord = sen.substring(0,space);
        String remain = sen.substring (space + 1);

        System.out.println( remain + " " + firstWord);


    }



}
