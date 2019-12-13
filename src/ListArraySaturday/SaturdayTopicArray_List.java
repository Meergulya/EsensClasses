package ListArraySaturday;

import java.util.ArrayList;

public class SaturdayTopicArray_List {

    public static void main(String[] args) {


//        ArrayList<String>names=new ArrayList<>();
//        names.add("Jason");
//        names.add("Adam");
//        names.add(1,"John");
//        System.out.println(names);
//        System.out.println(names.get(1));

ArrayList<Cat> catsForSale = new ArrayList<>();
Cat cat1 =new Cat();
cat1.color="White";
cat1.age =3;
catsForSale.add(cat1);
Cat cat2=new Cat();
cat2.color="Orange";
cat2.age=1;
catsForSale.add(cat2);
        System.out.println(catsForSale.size());

        for (int i=0; i<catsForSale.size();i++){
            System.out.println("Cat# " + (i+1) + " Color: " +catsForSale.get(i).age);
            System.out.println(catsForSale.get(i).color);

        }















    }
















}
