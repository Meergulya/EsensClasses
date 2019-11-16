package Random;

import java.util.Random;

public class RandomExercise {


    public static void main(String[] args) {

        Random random = new Random ();

        int number = random.nextInt(26);
        number+=65;


        char c = (char) (number);
        System.out.println("Your letter is " + c);
        System.out.println("My number is " + number);

    }






}
