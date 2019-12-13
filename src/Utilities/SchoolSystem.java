package Utilities;

import java.util.ArrayList;

public class SchoolSystem {


    public static void main(String[] args) {
//        MyCollection mc = new MyCollection();
//       ArrayList<String>kv= MyCollection.getStringList();
//        System.out.println("\n"+kv);

ArrayList<String>list =new ArrayList<>();
        list.add("John");
        list.add("Jamilya");
        list.add("Lora");
        list.add("Sunny");
        list.add("Alejandro");
ArrayList<String>l =MyCollection.filterList(list,3);
        System.out.println(l);

    }
}
