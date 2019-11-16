package Examples;

import java.util.Scanner;

public class StRanLooNes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();

        boolean validLength = false;


        if (num.length() == 10 ){
            validLength = true;


            }

        else  if (num.length() ==12) {

            if (num.charAt(0) == '(' && num.charAt (4)== ')'){
                validLength=true;
       num= num.replace("(",")").replace("(",")");
        }
       }
int count = 0;
if (validLength) {
    for (int i =0; i<num.length(); i++) {

       char number = num.charAt(i);
       if (number>=48 && number <=57){
           count++;
       }
    }
}
if (count == num.length()){
    System.out.println("Valid Number");
}else {
    System.out.println("Invalid Number");
}
        }


    }



