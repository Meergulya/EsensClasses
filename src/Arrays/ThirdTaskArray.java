package Arrays;

public class ThirdTaskArray {
    public static void main(String[] args) {

        //    Task 3
//    The method takes an integer of array as an argument and
//    returns second largest number from that array.
//            ( Attention! Don't use Arrays.sort() method.
//            if you use ready method, you will get ZERO point)
//
//    Example:
//
//    argument: {12, 23, 3, 5, 89} => array
//return : 23
//
//        public static int secondLargestNum (int[] arr){

            // int [] arr = new int [6];

            int[] arr = new int [5];
            int second = arr[0];
            int first = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > first ) {

                first=second;
                  second=arr[i];

                }else if (first>second){
                    second=first;
                    first=arr[i];
                }

            }

            System.out.println(first);


        }


    }
