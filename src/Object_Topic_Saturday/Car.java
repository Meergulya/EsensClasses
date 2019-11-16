package Object_Topic_Saturday;

public class Car {

    String make;
    int year;
    boolean sportEdition;
    int mileage;


    public void drive(){
        System.out.println( year + " " + make + " is driving. ");
  mileage+=10;
    }

//    public void features(){
//        System.out.println("Make : " + make);
//        System.out.println("Year : " + year);
//        System.out.println("Sport Edition : " + sportEdition);
//        System.out.println(" Mileage : " + mileage);
//    }

    public void drive(String destination){
        this.mileage=mileage+10;
        System.out.println( this.year + " " + this.make + " is driving to " + destination);
    this.mileage+=10;
    }

    public void drive(int mile){
        System.out.println(this.year + " " + this.make + " is driving " + mile*mile + "miles");
    this.mileage+= mile;

    }



}
