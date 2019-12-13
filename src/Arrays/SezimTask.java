package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SezimTask {

    public static void main(String[] args) {


        String[] carBrands = {"Mercedes", "BMW", "Toyota", "Ferrari"};

        for (String myCar : carBrands) {
            if (myCar.equalsIgnoreCase("Mercedes")) {
                System.out.println(myCar + ": " + "Luxury-Comfort");
            } else if (myCar.equalsIgnoreCase("BMW")) {
                System.out.println(myCar + ": " + "Luxury-Sport");
            } else if (myCar.equalsIgnoreCase("Toyota")) {
                System.out.println(myCar + ": " + "Reliable-Cheap");
            } else if (myCar.equalsIgnoreCase("Ferrari")) {
                System.out.println(myCar + ": " + "Super-Expensive");
            }
        }


        String[] shows = {"Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Greys Anatomy"};
        Arrays.sort(shows);
        System.out.println("Sorted list of shows: ");
        for (int i = 0; i < shows.length; i++) {
            System.out.println("#" + i + " " + shows[i]);


        }


        int[] grades = {15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500};

        Arrays.sort(grades);
        for (int i = 0; i < grades.length; i++) {
        }

        System.out.println("Min grade " + grades[0]);
        System.out.println("Max grade " + grades[grades.length - 1]);


        int[] grade = {15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500};

        int max = grade[0];
        int min = grade[0];
        for (int i = 0; i < grade.length; i++) {

            if (max < grade[i]) {
                max = grade[i];
            } else if (min > grade[i]) {
                min = grade[i];
            }
        }
        System.out.println("Min grade: " + min);
        System.out.println("Max grade: " + max);


        String[] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
        Arrays.sort(groceryList);
        System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
        System.out.println("Index number of orange is: " + Arrays.binarySearch(groceryList, "orange"));


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to DIVIDE MY ARRAY");
        System.out.println("Enter a number that will be the size of your array: ");
        int number = input.nextInt();
        System.out.println("Enter numbers for your array: ");
        int[] arr = new int[number];


        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("String value of your array is: " + Arrays.toString(arr));

            int [] part1=Arrays.copyOfRange(arr,0,arr.length/2);
            int [] part2=Arrays.copyOfRange(arr,arr.length/2,arr.length);
        System.out.println("The first half of your array is: " + Arrays.toString(part1));
        System.out.println("The second half of your array is: " + Arrays.toString(part2));


String name =" We went to picnic today";
String [] array1 =name.split("");
        System.out.println(Arrays.toString(array1));

            for (String rev : array1) {
                for (int i = rev.length() - 1; i >= 0; i--) {
                    System.out.println("Reversed sentence is: " +rev.charAt(i));
               break;
                }

                System.out.println(" ");

            }


String sentence = " We are so happy family";
String reversed = "";

for (int i=sentence.length()-1; i>=0; i--){

    reversed+=sentence.charAt(i);

}
System.out.println(reversed);




String one = " java is fun";
int index=0;
String result ="";






    }

}