package Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {


    public static ArrayList<String>getStringList(){

        ArrayList<String>words=new ArrayList<>();
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.println("Enter word: ");
            words.add(input.nextLine());
            System.out.println("Are you done ? Y/N");
            if (input.nextLine().equals("Y")){
                break;
            }
        }

      return words;


    }


public static ArrayList<String>filterList(ArrayList<String>words,int size){
        ArrayList<String>newWords =new ArrayList<>();
        for(String s : words){
            if (s.length()==size){
                newWords.add(s);
            }
        }
        return newWords;
}






}
