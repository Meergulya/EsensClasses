package Arrays;

public class GurhanAbiTasks {

    //    public static void main(String[] args) {
//        int [][]numbers = {{7,89,45,34,39},{1,45,67,89,32},{12,34,56,67,75},{21,34,54,61,13}};
//
//
//        for (int row=0; row< numbers.length;row++){
//            for (int column=0;column<numbers[row].length; column++){
//
//                System.out.print(numbers[row][column] + "\t");
//
//            }
//            System.out.println(" ");
//        }
//
//    public static void main(String[] args) {
//
//
//        String happy = " I saw happy ";
//        char[] ch = happy.toCharArray();
//        for (char c : ch)
//            System.out.println(c);
//
//
//        String happyFamily = " You are a very interesting person";
//        String ready = "";
//        String[] readySentence = happyFamily.split(" ");
//
//        for (int i = readySentence.length - 1; i > 0; i--) {
//            ready += readySentence[i] + " ";
//            System.out.println(readySentence[i]);
//        }
//        //  System.out.println(ready + " ");
//    }
//    public static void main(String[] args) {
//        countWords();
//        login();
//        isPalindrome1("civic");
//    }
//
//    public static void countWords() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//        String sentence = input.nextLine();
//        String[] arr = sentence.split(" ");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("The number of words in the sentence :" + arr.length);
//
//    }
//
//
//    public static void login() {
//
//        Scanner input = new Scanner(System.in);
//        String na = "johnJava";
//        String ne = "123456";
//        System.out.println("You have clicked to login button. Please enter an account name: ");
//        String name = input.nextLine();
//        System.out.println("Please enter password: ");
//        String password = input.nextLine();
//        if (na.equalsIgnoreCase(name) && ne.equals(password)) {
//            System.out.println("Login successful");
//        } else {
//            System.out.println("Either your password or your account Id is not correct!");
//        }
//
//
//    }
//
//
//    public static boolean isPalindrome(String word) {
//
//        String str = "";
//
//        for (int i = word.length()-1; i>=0; i--) {
//            str += word.charAt(i);
//
//        }
//if (word.equalsIgnoreCase(str)){
//    return false;
//}
//
//        return true;
//
//    }

    public static void main(String[] args) {
        isPalindrome1("civic");
    }
public static boolean isPalindrome1(String again) {

int start =0;
int end= again.length()-1;

while(start<end){
   if (again.charAt(start)!=again.charAt(end)) {
       return false;
   }
start++;
   end--;

}


    return true;

}







}