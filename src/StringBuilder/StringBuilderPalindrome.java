package StringBuilder;

public class StringBuilderPalindrome {



      public static boolean  isPalindrome(String word) {
     StringBuilder newSb = new StringBuilder(word);
      newSb.reverse();
if (word.equals(word.toString())){
    return true;
}else{
    return false;
}



      }




















}
