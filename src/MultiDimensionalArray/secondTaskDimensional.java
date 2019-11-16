package MultiDimensionalArray;

public class secondTaskDimensional {
    public static void main(String[] args) {
        int [] [] arr = {{78,56,6456,23},{45,6,89,90},{1200,34,567,8769,5}};
        System.out.println(indexOfBiggestSummary(arr));
    }





        public static int indexOfBiggestSummary(int [] []twoDArr) {
            int index = 0;
            int biggest = 0;
            for (int i = 0; i < twoDArr.length; i++) {
                int sum = 0;
                for (int j = 0; j < twoDArr[i].length; j++) {
                    sum += twoDArr[i][j];
                }
                if (sum > biggest) {
                    biggest = sum;
                    index = i;
                }


            }

           return index;
        }
}