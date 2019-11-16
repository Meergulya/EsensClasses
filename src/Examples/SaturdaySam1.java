package Examples;

import java.util.Scanner;

public class SaturdaySam1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

      String firstName = "Mary";
      String surName = "Satym";
        System.out.println("Enter your first name");
        String name = input.nextLine();
        System.out.println(" Enter your last name");
        String lastName = input.nextLine();
        int compare = name.compareTo("firstName");
        System.out.println(compare);
int compare1= surName.compareTo("lastName");

        System.out.println(compare1);





    }





}
