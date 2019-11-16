package MethodOverloading;

public class MethodOverloadTask {
    public static void main(String[] args) {
        System.out.println(acceptsTwoString("day", "name"));
        System.out.println(acceptsTwoString("first", "second", 3));

    }


    public static String acceptsTwoString(String word, String word2) {
        return word + word2 + word;
    }


    public static String acceptsTwoString(String word, String word2, int number) {
        if (number <= 0) {
            return "";
        }
       String rev = "";
        for (int i = 0; i<number; i++){
            rev+=word;
            rev+=word2;

        }
    return rev;
    }
}
