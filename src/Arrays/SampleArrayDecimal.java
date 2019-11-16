package Arrays;

import java.util.Scanner;

public class SampleArrayDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//       boolean check=true;
//
//        for (int i=0; i<nums.length;i++) {
//
//
//            if (nums[i] == 5) {
//                check = false;
//            }
//        }
//            if (check){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }


         //   int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

           int a = 0;

            for (int i =0; i<nums.length; i++ ) {
                if (nums[i] != nums[i]){
                   a = nums[i];
                }
            }
        System.out.println(a);
        }
    }
























