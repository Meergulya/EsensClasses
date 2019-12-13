package Arrays;

public class GurhanAbiTest {

    public static void main(String[] args) {
        System.out.println(resultCount("About 478,000,000 results (1.01 seconds)" ));
        System.out.println(resultTime("About 478,000,000 results (1.01 seconds)" ));
       String lorem ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(LoremIpsum(lorem));
    }


public static String resultCount(String str2){


        String [] arr = str2.split(" ");
        String secondWord =arr[1];
        String removeCommas=secondWord.replace(",","");


   return removeCommas;
}

public static String resultTime(String sen){

        String [] arr1 = sen.split(" \\(");
        String ready = arr1[1];





        return ready.replace("\\)","");
}

public static boolean LoremIpsum(String again){
        String [] arr = again.split("\\.");
String third = arr[2];
        if (!third.contains("massa")){
                return false;
            }else{

            }

return true;
    }

}
