package ClassStatic;

public class Lexus {

    String model;
    int year;
    String color;
    double mileage;
    boolean isNew;
    double price;
    static int totalNumOfLexus;

    public Lexus(String model, int year) {
        this.model = model;
        this.year = year;
        totalNumOfLexus++;
    }

    public static double mileToKm(double mileage) {
        return mileage * 1.6;

    }

    public static void evaluateCar(Lexus car) {
        int age = 2019 - car.year;

        if (car.mileage < 50.000 && age < 3) {
            System.out.println("Best choice");

        } else if ((car.mileage >= 50.000 && car.mileage <= 100.000) && age >= 3 && age < 7) {
            System.out.println("Fair Choice");
        } else if (car.mileage >= 100.000 && car.mileage <= 200.000) {
            System.out.println("You decide");
        } else if (car.mileage > 200.000) {
            System.out.println(" Stay away");
        } else {
            System.out.println("Not able to evaluate ");
        }


    }


}
