package Object_Topic_Saturday;

import java.util.Scanner;

public class BuyerInfo {

    public static void main(String[] args) {
       // Item newItem = new Item();
        Scanner input = new Scanner(System.in);
        System.out.println ("How many items you have : ");
            int numOfItems =input.nextInt();
            input.nextLine();

            Item [] item = new Item [numOfItems];
            for (int i=0; i<item.length; i++){
                System.out.println("Enter the names of items: " + (i+1));
                String name=input.nextLine();
                System.out.println("Enter the prices fr each item: " + (i+1));
                double price = input.nextDouble();
                input.nextLine();

            item [i] =new Item (name,price);

            }
       for (Item myItem : item){
           myItem.info();
       }


        }







    }





