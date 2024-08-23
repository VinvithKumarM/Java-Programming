package arrays;

import java.util.*;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] arrayOne, int[] arrayTwo){

        List<Integer> commonIntegers = new ArrayList<>();

        HashMap<Integer, Integer> integerCountsOfArrayOne = getCountOfIntegers(arrayOne);
        HashMap<Integer, Integer> integerCountsOfArrayTwo = getCountOfIntegers(arrayTwo);

        for(Map.Entry<Integer, Integer> entry : integerCountsOfArrayOne.entrySet()){
            if(integerCountsOfArrayTwo.containsKey(entry.getKey())){
                int count = Math.min(integerCountsOfArrayTwo.get(entry.getKey()), entry.getValue());
                for(int i=0; i< count; i++){
                    commonIntegers.add(entry.getKey());
                }
            }
        }
        int[] intArray = new int[commonIntegers.size()];
        for (int i = 0; i < commonIntegers.size(); i++) {
            intArray[i] = commonIntegers.get(i); // Autoboxing and unboxing
        }
        return intArray;
    }

    public HashMap<Integer, Integer> getCountOfIntegers(int[] array){
        HashMap<Integer, Integer> integerCounts = new HashMap<>();
        for(int i : array){
            integerCounts.compute(i, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return integerCounts;
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] arrayOne = {2,3,3,3,3,4,4,6,7,7};
        int[] arrayTwo = {3,4,4,7};
        int[] result = intersectionOfTwoArrays.intersection(arrayOne, arrayTwo);
        for(int i : result){
            System.out.println(i);
        }
    }
}
