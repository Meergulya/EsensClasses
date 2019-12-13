package AccessModifiers;

import java.util.ArrayList;

public class SHOPPING {

    public static void main(String[] args) {


        ArrayList<String> shoppingList = new ArrayList<>();

shoppingList.add("Banana");
shoppingList.add("Strawberry");
shoppingList.add("Blueberry");
shoppingList.add("Watermelon");
shoppingList.add("Melon");


int count= shoppingList.size();
        System.out.println("Total numbers in the array: " + count);


        System.out.println(shoppingList.toString());
        shoppingList.add(0,"Apple");
        System.out.println(shoppingList);
        System.out.println("Is shopping list empty? " + shoppingList.isEmpty());
        shoppingList.remove("Apple");
        System.out.println(shoppingList);

        ArrayList<Integer> num =new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(3);
        num.add(34);
        num.add(67);

if (num.contains(2)){
    System.out.println("true");
}
        System.out.println(num);
        num.remove(3);

        System.out.println(num);
        num.remove(new Integer(67));
        System.out.println(num);
        num.remove(0);




    }











}
