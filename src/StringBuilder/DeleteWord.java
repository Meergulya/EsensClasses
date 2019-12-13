package StringBuilder;

public class DeleteWord {
    public static void main(String[] args) {
        System.out.println(deleteWord("This word con is right in the beginning of the word"));
    }

    public static String deleteWord(String word) {

        StringBuilder del = new StringBuilder(word);
        int index = del.indexOf("con");
        if (index >= 0) {

            del.delete(index, index + 3);

        }
        return del.toString();
    }

    public static String deleteWord(String word, String target) {

        StringBuilder del = new StringBuilder(word);
        int index = del.indexOf(target);
        if (index >= 0) {

            del.delete(index, index + target.length());

        }

        return del.toString();
    }


}




