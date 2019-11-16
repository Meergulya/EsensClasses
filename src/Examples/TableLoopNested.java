package Examples;

import java.util.Scanner;

public class TableLoopNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }


//        Write a program to find the factorial value of any number entered through the keyboard.
//                Example:
//
//        Input:
//        5
//        Output:
//        Factorial: 120

        System.out.println(" Enter a number : ");
        int number = input.nextInt();
        int x = 0;
        for (int i = 1; i <=5; i++){
            int y = i * i;
            System.out.println(y);



    }

    }
}
