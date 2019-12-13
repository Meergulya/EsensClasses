package MultiDimensionalArray;

public class ReplitTask {
    public static void main(String[] args) {


//    int [][]arr={{2,3,4},{5,6,7}};
//    int [][]newArr=new int [2][];
//    int n=2;
//
//    for (int i=0; i<newArr.length;i++) {
//        for (int j = 0; j < newArr[i].length; j++) {
//
//          newArr[i][j]=arr[i][j] *2;
//            System.out.println(Arrays.deepToString(newArr));
//
//        }
//    }


        int [][] array = {{56,67,89,89,60,54},{87,90,90,65,8,64}};
        int biggestNum=array[0][0];
        for (int i=0; i<array.length;i++){
            for (int k=0; k<array[i].length; k++){

               if (array[i][k]>biggestNum){
                   biggestNum=array[i][k];
               }
            }
        }

//        System.out.println(biggestNum);


        int [][] arr = {{56,67,89,89,60,54},{87,90,90,65,8,64}};
int matches = 0;

for (int i=0; i<arr.length; i++){
    for (int j=1; j<arr[i].length-1; j++){
        if (arr[i][j]==arr[i][j-1]){
            matches++;
        }

    }
}
System.out.println("matches: " + matches);





    }
}
