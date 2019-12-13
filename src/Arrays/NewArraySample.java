package Arrays;

import java.util.Arrays;
import java.util.Random;

public class NewArraySample {

    public static void main(String[] args) {


        String[] colors = {"Blue", "White", "Pink", "Green"};

        System.out.println(Arrays.toString(colors));

        for (int i = 0; i < colors.length; i++) {

            System.out.println(colors[i]);

        }


        String name = "java is fun";

        String[] arr = name.trim().split(" ");
        String camel = "";
        for (int i = 0; i < arr.length; i++) {
            camel += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }

        System.out.println(camel.trim());


        String two = " i love my husband";
        String ready = "";
        String[] array = two.trim().split(" ");
        for (int i = 0; i < array.length; i++) {

            ready += array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase() + " ";

        }


        System.out.println(ready.trim());


        String three = " i love my two cutie pies";
        String will = "";
        String[] arr1 = three.trim().split(" ");
        for (int i = 0; i < arr1.length; i++) {
            will += arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1).toLowerCase() + " ";
        }

        System.out.println(will);


        String[] names = {"Aidana", "Samara", "Janara", "Kamila", "Aisalkyn", "Bozsalkyn", "Aidai", "Aijamal","Zarina","Karina","Salkyn","Symbat","Nargiza","Sabira","Aida","Aisalkyn"};
        System.out.println("Total names: " + names.length);

String temp="";
        for (int i = 0; i < names.length; i += 2) {

            temp=names[i];
            names[i]=names[i+1];
            names[i+1]=temp;
            System.out.println(Arrays.toString(names));

            System.out.println(names[i] + ", " + names[i + 1] );
            System.out.println(names[i+1] + ", " + names[i]);
        }
    Random random=new Random();
        int r = random.nextInt(names.length);

        System.out.println("Random name "+ names[r]);


   String world = " Good,Morning, A, New, Beautiful, World";
   String [] ar = world.split(",");

        System.out.println(world);
        //System.out.println(ar);
        System.out.println(Arrays.toString(ar));


    }
        }

