package MethodOverloading;
public class CallMethodOverloading {

    public static void main(String[] args) {
takesEverything("Welcome", 3,4);
    }


    public static  void takesEverything( String firstChar ) {


        System.out.println(firstChar.charAt(0));

    }

    public static void takesEverything (String firstChar, int index ) {

        System.out.println(firstChar.charAt(index));
    }

    public static int takesEverything(String firstChar, int num,int number) {

       return firstChar.substring(num,number).length();

    }













    }


