package Arrays;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String newWord = "";
        for (int i=0; i<word.length(); i++){
            if(!newWord.contains(word.charAt(i) +"")){ ;
               newWord+=word.charAt(i) ;
            }
        }
                System.out.println(newWord);









    }



}
