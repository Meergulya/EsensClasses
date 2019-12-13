package Constructor;

public class Phone {


    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;

    }

    public Phone(String model, String color, int memory, boolean touchscreen) {
        this.model = model;
        this.color = color;
        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.out.println(" Invalid Memory");
        } else {
            this.memory = memory;
        }


    }

    public void info() {
        System.out.println(" Model: " + this.model);
        System.out.println("Memory: " + this.memory);
        System.out.println("Color: " + this.color);
        System.out.println("Touchscreen: " + this.touchscreen);
        System.out.println("Phone Number: " + this.phoneNumber);

    }

    public boolean text(long phoneNumber, String text) {
        String number = "" +phoneNumber;
        if (number.length() == 10 && !text.isEmpty()) {
            System.out.println(text + " is sent to " + number);
              return true;
        } else {
            System.out.println(" Invalid phone number or text");
        }

              return false;
    }


public void call(long phoneNumber){
        String number = ""+phoneNumber;
        if (number.length()==10){
            System.out.println("Calling to " + phoneNumber);
        }else{
            System.out.println(" Invalid Phone Number ");
        }
}


}


