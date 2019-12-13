package Constructor;

public class PhoneTest {

    public static void main(String[] args) {

        Phone phone = new Phone("Iphone X","GOLD");
        phone.info();
Phone nokia = new Phone("Nokia X", "Black", 32,true);
nokia.info();

        System.out.println();

     nokia.text(1277375441,"Hey");


nokia.call(9087654321L);


    }











}
