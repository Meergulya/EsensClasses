package Constructor;

public class Sky {

    public Sky(String colorCode){
      //  System.out.println("Hi there!");
       this.color = colorCode;



    }

    String color;
    int visibleStars;

    public static void main(String[] args) {
        Sky refSky=new Sky("Blue");
        System.out.println(refSky.color);
        Sky sky2 =new Sky("Yellow");

    }

public Sky(String color, int visibleStars){
        this.color=color;
        this.visibleStars=visibleStars;
}





}
