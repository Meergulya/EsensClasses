package Arrays;
import java.util.Arrays;
public class AnagramGurhanAbi {

    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
        beFibonacci(10);
    }


    public static boolean isAnagram(String first, String second) {
char [] arr1= first.toCharArray();
char [] arr2=second.toCharArray();
  Arrays.sort(arr1);
  Arrays.sort(arr2);



return Arrays.equals(arr1,arr2);


}

public static void beFibonacci(int N){

int num1=0;
int num2=1;
    System.out.println("The first" + N +" numbers of Fibonacci numbers are");

    for (int i=0; i<N; i++){
        System.out.print(num1 + " - ");
        int sum = num1+num2;
        num1=num2;
        num2=sum;
    }



}

}