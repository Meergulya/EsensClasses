package Examples;

import java.util.Scanner;

public class PalindromeProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = input.nextLine().toLowerCase();
        String back = "";
        for(int i = word.length() -1; i >=0 ; i--){
            back += word.charAt(i);
        }
        if(word.equals(back)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }






    }





}
