package FirstPackage;

import java.util.Scanner;

public class TaskDoWhile {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        char letter = input.nextLine().toUpperCase().trim(). charAt(0);
        if (letter>=65 && letter <=90){

        }else{
            System.out.println("Not a valid letter");
        }

        while(letter!= 91){
            System.out.println(letter++);
        }



    }





}
