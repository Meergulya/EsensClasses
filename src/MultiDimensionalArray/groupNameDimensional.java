package MultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class groupNameDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many groups you have ? ");
        int  number = input.nextInt();
        System.out.println(" How many students in each group ? ");
        int num = input.nextInt();

        input.nextLine();
 String [][] arr = new String[number][num];

        for (int i = 0; i < number; i++) {

                   for (int j = 0; j < num; j++) {
                System.out.println(" Enter student names: ");

                arr[i][j] = input.nextLine();
                //continue;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }


}
