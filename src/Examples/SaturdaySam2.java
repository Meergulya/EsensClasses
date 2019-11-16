package Examples;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class SaturdaySam2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println(" Enter a sentence");
        String sentence = input.nextLine();
        int am = sentence.indexOf("am") + 3;
        int years = sentence.indexOf("years");
        String age = sentence.substring(am,years - 1);
        int ageNum = Integer.valueOf(age);
        ageNum +=5;
        System.out.println(" In 5 years you will be " + ageNum);





    }




}
