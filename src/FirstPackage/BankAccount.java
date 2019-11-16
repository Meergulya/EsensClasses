package FirstPackage;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost of an item ");
        int cost = input.nextInt();
        int balance = 1500;
        int transBal;
        int dec=0;



        while ( balance>0){

            System.out.println("Enter your transaction amount ");
            transBal=input.nextInt();
            if (transBal<=balance){
                System.out.println("Item purchased");
                balance-= transBal;

            }else{
                System.out.println(" Card is declined");
            dec++;
            }



        }











    }






}
