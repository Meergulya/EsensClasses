package PackageWrapperClass;

public class NumberChecker {

    public static void main(String[] args) {

        MagicNumber magicNumber = new MagicNumber();
        magicNumber.generateNumbers(7);

        System.out.println(magicNumber.numbers);


   MagicNumber evenMagic = new MagicNumber();
   evenMagic.generateEvens(8);
        System.out.println(evenMagic.numbers);

    }





}
