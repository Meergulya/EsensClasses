package Babies;

public class RandomSecondTask {


    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(10);
        number1++; // this is how we get the range to be 1-10
        System.out.println("Guess a number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();



        if (number>number1){
    System.out.println("You entered too high number");
        }
        if (number <number1){
            System.out.println("You entered too low number");
        }


    }
}
