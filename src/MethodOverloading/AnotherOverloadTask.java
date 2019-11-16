package MethodOverloading;

public class AnotherOverloadTask {
    public static void main(String[] args) {
        System.out.println(anotherTask("word","chicken"));
    }

    public static boolean anotherTask(String str, String str2) {
       // boolean check = false;
        return (str.startsWith(str2));
       // check = true;
        }



    public static boolean anotherTask(String str, String str2, int times) {
        int count = 0;
        //boolean a = true;
        for (int i = 0; i<str.length(); i++){

            if (str2.contains(str) )
       count++;
       return true;
        }

            return false;
        }


    }














