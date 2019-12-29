package Inheritance;

public class Huskey extends Dog {
    String furType;


   // public static void main(String[] args) {



//        Huskey huskey = new Huskey();
//        huskey.name = "Reks";
//      huskey.breed="Medium";
//

   // }

public void livingInCold(){

}

    public static void main(String[] args) {
        Dog a = new Dog();
        Huskey b = new Huskey();
        a = b;
        System.out.println(a.getClass());
    }

int num =5;

}