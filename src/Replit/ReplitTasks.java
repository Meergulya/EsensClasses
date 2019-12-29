package Replit;

public class ReplitTasks {

    public static void main(String[] args) {
//        - to search and find each appearance of coverME within main
//                - then surround it with [coverMe] (square brackets)
//        - if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
//                - keep in mind that coverME value can be of any length.

        String name = "apple";
        String word = "ap";
int in=0;
String ready="";

        for (int i = 0; i < name.length(); i++) {


            if (name.contains(word)) {


               ready=name.substring(name.indexOf(word));
               name= name.substring(ready.length(),name.length())+"["+ready+"]"+name.substring(name.length());



            }
        }
            System.out.println(name);

        int num =90;
        String apple= "apple";




        }

    }











