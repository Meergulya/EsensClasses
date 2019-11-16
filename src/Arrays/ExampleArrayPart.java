package Arrays;
import java.util.Arrays;
public class ExampleArrayPart {

    public static void main(String[] args) {




        String [] names = new String [7];
        names [0] = " James ";
        names [1] = " Sam ";
        names [2] = " Adam ";
        names [3] = " Elize ";
        names [4] = " Jamie ";
        names [5] = " Benzema ";
        names [6] = " Sandy ";
        System.out.println(Arrays.toString(names));


        for (int i = 0; i <names.length; i++){
          int last = names[i].length()-1;

            System.out.println( names[i].charAt(last));
            System.out.println(names[i]);
        }
          System.out.println();





        for (int i =0; i < names.length; i++){
            if(names[i].toLowerCase().endsWith("s"));
            System.out.println(names[i]);
        }
        System.out.println();





        for (int i = 0; i < names.length; i ++){
            if (names[i].toLowerCase().contains("s")){

                System.out.println(names[i]);
            }

        }

        System.out.println();


      }








}
