package Examples;

import java.util.Scanner;

public class SundaySam1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter two words that are 6 characters long : ");
        String word = input.nextLine();
        String word2= input.nextLine();
       String email = "";

       if (word.length() >=6 && word2.length() >=6){

          email = word.substring (0,4);
          email+= word2.substring(word2.length() - 3);
          email+= "@cybertek.com";
           System.out.println(email);


       }else {

           System.out.println("Invalid Data");
       }







    }






}
