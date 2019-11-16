package CodeCodeCode;

import java.util.Scanner;

public class BatCode {
    public static void main(String[] args) {
        System.out.println(takeTwo("hi", 3));
    }

    public static String takeTwo(String str, int n) {


        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            String result = "";
            if (str.length() > 3) {
                result += str.substring(0, 3);
                return result + result + result;
            }
            if (str.length() <= 3) {


            }
        }

        return str + str + str;
    }


}




