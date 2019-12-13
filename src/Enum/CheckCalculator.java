package Enum;

public class CheckCalculator {


    public static double operator(Calculator op, double num, double num1) {


        switch (op) {

            case PLUS:
                return num + num1;
            case MINUS:
                return num - num1;
            case MULTIPLE:
                return num * num1;
            case DIVIDE:
                if (num1 == 0) {
                    System.out.println("You can not divide by 0");
                    return 0;

                }
                return num / num1;
            case REMAINDER:
                if (num == 0 || num1 == 0) {
                    System.out.println("Invalid remainder operation");
                    return 0;
                }

        }
return num %num1;
    }

}
