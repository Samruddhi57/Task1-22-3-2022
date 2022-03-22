package collection;


import java.util.ArrayList;
import java.util.Collection;

public class Page1 {

    public static void main(String[] args) {

        Collection < String > fruitCollection = new ArrayList < > ();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        fruitCollection.add("strawberry");
        System.out.println(fruitCollection);

        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        System.out.println(fruitCollection);
        fruitCollection.size();

        fruitCollection.forEach((element) -> {
            System.out.println(element);
        });

        fruitCollection.clear();

        System.out.println(fruitCollection);
    }
}