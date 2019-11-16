package Examples;

import java.util.Scanner;

public class SaimTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        String a = "Cybertek is located in Des Plaines";
//
//        String word =input.nextLine();
//        int index = a.indexOf (word);
//        System.out.println(index);
//
//
//
//
//             String month ="October";
//        System.out.println("Enter the month");
//            String m=input.nextLine();
//            boolean check = m.equalsIgnoreCase ("October");
//        System.out.println(check);
//
//
//       String weather = " We will have a picnic when the weather gets nicer";
//       System.out.println("Enter the set of characters from the sentence you want to change");
//        String character = input.nextLine();
//        System.out.println("What do you want to change?");
//        String change = input.nextLine();
//       String fixed = weather.replace(character, change);
//       System.out.println(fixed);
////
////
//
           String sen = input.nextLine();
           String sen1 = input.nextLine();
       int compare = sen.compareTo(sen1);
        if (compare < 0){
            System.out.println(sen);
        } else if (compare >0) {
            System.out.println(sen1);
        }else {
            System.out.println("equal");
        }

                System.out.println("Enter your name");
                String name = input.nextLine();

                 if (name.startsWith ("a" ) || name.startsWith("A") || name.startsWith("z") || name.startsWith("Z") ){
                     System.out.println("Your name is cool");
                 } else {
                     System.out.println("Sorry not a cool name");
                 }


            String cars = "Toyota,BMW,Hyndai";

                 if (cars.contains("Toyota") || cars.contains("Nissan")){
                     System.out.println(" There is a Japanese car in your garage");
                 }
                 else {
                     System.out.println("No japanese cars");
                 }
                 if (cars.isEmpty()) {
                     System.out.println("Garage is empty");
                 }
                  if (cars.contains("BMW")) {
                     System.out.println("There is a German car in your garage");
                 }else {
                      System.out.println("There is no German cars in your garage");
                  }

                  if (cars.contains("Hyndai")) {
                     System.out.println("There is a Korean car in your garage");
                 }else {
                      System.out.println("There is no Korean cars in your garage");
                  }
                  if (!cars.contains("cars")) {
                     System.out.println(" No x cars");
                 }




    }

}





