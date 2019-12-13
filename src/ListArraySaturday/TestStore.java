package ListArraySaturday;

import Object_Topic_Saturday.Item;

public class TestStore {
    public static void main(String[] args) {


  Store zara=new Store("Zara","312 main St");

        Item item1 = new Item ("Socks", 15);
        Item item2 = new Item ("Coat",100);
        Item item3 = new Item ("Jacket",159);



        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);

        System.out.println(zara.numberOfItems);
         zara.seeInventory();

        // zara.addItem("Gloves");
         zara.sellItem("Blouse");
         zara.returnItem("Table");
         zara.seeInventory();

    }













}
