package Examples;

public class codingbat {
    public static void main(String[] args) {

    String a="abc";
    String b="cat";
        String sum = a+b;
        if(a.substring(a.length()-1).equals(b.substring(0,1))){
            System.out.println(a.substring(0,a.length()-1)+b);
        } else  {System.out.println( sum);}




    }
}
