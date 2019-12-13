package ListArraySaturday;

import Object_Topic_Saturday.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    int numberOfItems;
    double totalSales;
    ArrayList<Item>itemsForStore= new ArrayList<>();



    public Store(String name, String address){
        this.name=name;
        this.address=address;

    }

public void addItem(Item item){
      this.itemsForStore.add(item);
       this.numberOfItems++;
}



public void seeInventory(){
    System.out.println("\nZARA Chicago Store");
    System.out.println("Total Sales: " + this.totalSales + " $");
        for (Item item:itemsForStore) {
item.info();

       item.info();
            System.out.println();

        }


    }


public void sellItem(String name){

    for (int i=0; i<itemsForStore.size();i++){

        if (itemsForStore.get(i).name.equals(name)){
            this.totalSales+=itemsForStore.get(i).price;
            itemsForStore.remove(i);
            System.out.println("Successful transaction");
            this.numberOfItems--;
            return;
        }else{
            System.out.println(" Failed transaction");

        }
    }

}




    public void returnItem(String name){
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter the price of the returned item ");
        double price=input.nextDouble();
        input.nextLine();
        Item item=new Item (name,price);
        this.itemsForStore.add(item);
        totalSales-=price;
        this.numberOfItems++;
        System.out.println("\nReturn process successful. ");

}






}
