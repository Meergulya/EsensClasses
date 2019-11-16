package MultiDimensionalArray;

public class forEachDimensional {
    public static void main(String[] args) {

        int [] [] numbers ={{1,2,3,5,6},{4,5,6},{7,8,9}};



for (int[] inner : numbers){
    for (int element : inner){
        System.out.println(element);
    }
    System.out.println();

}




    }









}
