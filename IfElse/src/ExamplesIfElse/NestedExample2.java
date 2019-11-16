package ExamplesIfElse;

import java.util.Scanner;

public class NestedExample2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kilogram");
        double mass = input.nextDouble();
        System.out.println("Please enter your height in meters");
        double height = input.nextDouble();
        double BMI = mass / (height*height);


        if(BMI < 18.5 ){
            System.out.println("Underweight");
        }

        else if (BMI>=18.5 && BMI <25){
            System.out.println("Normal weight");
        }
        else if ( BMI >= 25 && BMI <30){
            System.out.println("Overweight");
        } else if (BMI >=30) {
            System.out.println("Obese");
        }







    }





}
