package Examples;

import java.util.Scanner;

public class UtophianTree {
    public static void main(String[] args) {


//        The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows
//        by 2 cm every year, this is a simple implementation of the algorithm.
//        You will need to use loops to create it.
//                Show 10 years of growth of the Utopian Tree.
//
// Output:
//        year 1 - growth 1 cm
//        tree size: 1cm
//        year 2 - growth 1 cm
//        tree size: 2cm
//        year 3  - growth 1 cm
//        tree size:3cm
//        year 4 - growth 2 cm
//        tree size: 5cm
//        year 5 - growth 2 cm
//        tree size: 7cm
//        year 6 - growth 2 cm
//        tree size: 9cm
//... until you reach year 10


        int size = 0;
        int tree = 0;
        for (int i = 0; i <= 10; i++) {

            if (i >= 1 && i <= 3) {
                size = 1;
                System.out.println("year " + i + " - " + "growth " + size + " cm ");
                tree++;
                System.out.println(" tree size : " + tree + "cm");

            } else if (i > 3 && i <= 10) {
                size = 2;
                tree += size;
                System.out.println("year " + i + " - " + "growth " + size + " cm ");

                System.out.println(" tree size : " + tree + " cm");
            }
        }
        Scanner input = new Scanner(System.in);


        System.out.println(" Please enter a quest name : ");
        String name = input.nextLine();
        String answer = "";
        String guests = "";


do {
    System.out.println(" Do you want to enter new quest name : ");
    answer = input.nextLine();
    System.out.println(" Please enter a quest name : ");
    name = input.nextLine();
guests +=name + ", ";

     } while (answer.equals("yes")) ;

guests = guests.substring(0,guests.length()-2);
     System.out.println(" Guest's list: " + guests);
    }





    }

