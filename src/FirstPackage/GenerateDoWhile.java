package FirstPackage;

import java.util.Random;
import java.util.Scanner;

public class GenerateDoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) +1;
         int guess=0;
       int count = 0;


        do{

            System.out.println("Guess a number");
           guess=input.nextInt();
            count++;

            if (guess <randomNum){
                System.out.println("Too low");
            }else if (guess>randomNum){
                System.out.println("Too high");
            }else{
                System.out.println(" You guessed right after " + count + "tries !");
            }

        }while (randomNum!= guess);








    }






}
