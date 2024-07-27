package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

    List<String> colors = new ArrayList<>();

    public void arraylistOperations(){
        System.out.println("Colors Arraylist");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.stream().forEach(System.out::println);

        //Add new color
        System.out.println("Added new color at index 1 ");
        colors.add(1, "Orange");
        colors.stream().forEach(System.out::println);

        //Update color
        System.out.println("Updated color Orange at index 1 to black");
        colors.set(1, "black");
        colors.stream().forEach(System.out::println);

        //Remove color
        System.out.println("Removed color at index 1");
        colors.remove(1);
        colors.stream().forEach(System.out::println);

        //Sort colors
        Collections.sort(colors);
        System.out.println("Sorted array : "+colors);

        //Add array of colors to new arraylist
        List<String> newColors = new ArrayList<>(colors);
        System.out.println("newColors array : "+newColors);

        //Reverse colors arraylist - we can also use collections.reverse
        System.out.println("Revered colors arraylist : "+colors.reversed());

        //Get a portion of an arraylist
        System.out.println("Sublisted arraylist : "+colors.subList(0, 2));

        //Compare 2 arraylist
        List<String> colorsList2 = new ArrayList<>();
        colorsList2.add("White");
        colorsList2.add("Blue");
        colorsList2.add("Pink");

        List<String> commonColors = colors.stream().filter(a -> colorsList2.contains(a)).toList();
        System.out.println("Common Colors list : "+ commonColors);

        //Swapping elements in index 0 and 1
        System.out.println("New colors list before swapping elements : "+colorsList2);
        Collections.swap(colorsList2, 0, 1);
        System.out.println("New colors list after swapping elements : "+colorsList2);

        //Join Arraylist
        colorsList2.addAll(colors);
        System.out.println("Joined Array : "+colorsList2);

        //Empty Arraylist
        colorsList2.removeAll(colors);
        System.out.println("Remove common color : "+colorsList2);

        System.out.println("Colors list is empty : "+colors.isEmpty());

        //trim the arraylist to its size - remove the unused spaces
        ArrayList<String> c1= new ArrayList<String>(colors);
        c1.trimToSize();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        System.out.println("Colors trim to size : "+colors);

        //Increase the arraylist size
        c1.ensureCapacity(10);
        c1.set(1, "d");
        System.out.println("Array with Replaced element in c1 array"+ c1);

        //Fetch element from arraylist with index
        System.out.println("Printing array elements with the help of index : "+c1.get(1));

    }
}
