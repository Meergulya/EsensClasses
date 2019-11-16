package FirstPackage;

import java.util.Scanner;

public class WhileLoopWhile {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        while (true){
//            System.out.println("Hello World");
//
//        }


        System.out.println("Enter a number above 0");
             int number = input.nextInt();
             int start = 0;
             while (start <= number ){
                 System.out.println(start++);


             }






    }








}
