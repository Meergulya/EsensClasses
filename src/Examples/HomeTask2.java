package Examples;

import java.util.Random;
import java.util.Scanner;

public class HomeTask2 {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

//        2) Send Message: User will enter a message, if message is valid it will be sent,
//                there is a chance the message will not be delivered due to internet
//                  User takes a message that needs to be at least 15 characters
//                > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
//                > If message was sent there is a 50 % chance the message will not be delivered.
//        If the message is delivered user will see message: “ delivered”
//        HINT: use random number for random chance to send
//

        System.out.println("Enter a message ");
        String mess =input.nextLine ();
        if ( mess.length()>= 15)  {
            System.out.println("Sent");
            Random random=new Random();
            int num=random.nextInt(2);
            if (num>=2){
                System.out.println("Delivered");
            }else{
                System.out.println("Not Delivered");
            }
        }
        else {
                System.out.println(" Not Sent");
            }












    }





}
