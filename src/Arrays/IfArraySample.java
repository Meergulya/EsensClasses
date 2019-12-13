package Arrays;
import java.util.Arrays;

public class IfArraySample {

    public static void main(String[] args) {


        String[] colors = {"Blue", "White", "Pink", "Green"};

        System.out.println(Arrays.toString(colors));

        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            if (colors[i].length() >= 4) {

            }

            System.out.println(color);

        }


        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[]arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2==0){
               arr[i]= nums[i]*2;

            }
             if (nums[i]%2==1){

                arr[i]=nums[i]*3;
            }






        }

        System.out.println(Arrays.toString(arr));

    }


}
