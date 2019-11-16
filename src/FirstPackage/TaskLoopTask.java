package FirstPackage;

import java.util.Scanner;

public class TaskLoopTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 3) {
                continue;
            }
            System.out.println(i);
        }


   for (int i=0; i <=50; i++) {

       String temp = i + "";
       System.out.println(temp);
       if(temp.endsWith("3")) {
           continue;
       }
       System.out.println(i);
   }

    }










    }











