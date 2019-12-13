package UdemyClass;

public class PracticeUdemy {


    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//
//        String name = input.nextLine();
//        String [] result = name.trim().split(" ");
//
//       for (int i=result.length -1; i>=0; i--){
//
//           System.out.print(result[i] + " ");


        String a = "Smart";
        String b = "Art";


        if (a.length() > b.length()) {
            a = a.substring(a.length() - b.length());

        }
        if (b.length() > a.length()) {
            b = b.substring(b.length() - a.length());
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }


}







