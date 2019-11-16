package Examples;

import java.util.Scanner;

public class SaturdaySam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the message");
        String message = input.nextLine();
        String checked =message;
       checked = checked.replace("idiot","smart");
        checked = checked.replace("dumb","smart");
        checked = checked.replace("stupid","smart");

if (message.equalsIgnoreCase(checked)) {
    System.out.println("Your message was not changed");
    System.out.println(message);
}else {
    System.out.println("Your message was changed");
    System.out.println(checked);
}










    }








}
