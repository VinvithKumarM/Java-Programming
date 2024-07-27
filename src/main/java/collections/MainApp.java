package collections;

import generalCoding.FindSecondLargestNumber;

public class MainApp {

    public static void main(String[] args){
        Arraylist arraylist = new Arraylist();
        arraylist.arraylistOperations();
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();
        System.out.println(removeDuplicatesFromArray.removeDuplicates(new Integer[]{1,2,3,3,4,3,8,7,7,9,1,5,6,6}));
        FindSecondLargestNumber findSecondLargestNumber = new FindSecondLargestNumber();
        System.out.println("Find second largest : "+findSecondLargestNumber.getSecondLargestNumber());
    }
}
