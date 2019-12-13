package Object_Topic_Saturday;

import java.util.Scanner;

public class HouseAskFromConsole {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        House myHouse=new House(); // I JUST CREATED AN OBJECT;

        System.out.println(" What type of house you have ?");
        myHouse.type=input.nextLine();
        System.out.println(" What is the address ?");
        myHouse.address =input.nextLine();
        System.out.println(" How many rooms you have ?");
        myHouse.numRooms=input.nextInt();

        myHouse.info();

    }








}
