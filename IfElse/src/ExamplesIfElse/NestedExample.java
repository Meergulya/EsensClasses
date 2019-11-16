package ExamplesIfElse;

public class NestedExample {

    public static void main(String[] args) {


        int number = 30;

        if (number >= 0 && number <= 50) {

        } else {
            System.out.println("Your number is not in 0-50 range");
        }
        if (number >= 10 && number <= 40) {

        } else {
            System.out.println("Your number is not in 10-40 range");
        }
        if (number >= 20 && number <= 30) {

            System.out.println("your number is good");
        } else {
            System.out.println("Not in the 10-30 range");
        }
    }

}