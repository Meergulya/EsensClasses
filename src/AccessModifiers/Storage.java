package AccessModifiers;

import java.util.Scanner;

public class Storage {

    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "Ikea";
        chair.size = 15;
        Person person = new Person();
        person.setName("Zaya");
        System.out.println(person.getName());


        Scanner input = new Scanner(System.in);
        do {
            System.out.println(" Enter the age for Zaya");
            int age = input.nextInt();
            input.nextLine();
            if (age > 0 && age < 120) {
person.setAge(age);
break;
            }
        }while(true);

        System.out.println();


    }
}
