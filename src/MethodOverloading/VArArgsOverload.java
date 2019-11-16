package MethodOverloading;

import java.util.Arrays;

public class VArArgsOverload {

    public static void main(String[] args) {
      maxNumber(3,4,5,7,19);
    }


    public static void maxNumber(int ...arr) {
        Arrays.sort(arr);
        System.out.println(" The biggest number is " + arr[arr.length -1]);


    }










}
