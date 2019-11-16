package Examples;

import java.util.Scanner;

public class sumAllValue {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println(" Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 =input.nextInt();
       int sum = 0;
       int aver = sum / 2;
        for (int i = num1; i <=num2; i++){
            sum +=i;
            System.out.println(" The sum of " +  num1  +  " to " + num2 + " is : " + sum);
        }
            System.out.println( " The average is"+aver);






    }




}
