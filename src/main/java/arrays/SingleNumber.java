package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    //Normal Approach - o(n) Time Complexity, o(n) Space Complexity
    public int returnSingleNumber(int[] inputArray){
        HashMap<Integer, Integer> noOfIntegerDuplicates = new HashMap<>();
        for(Integer i : inputArray){
            if(noOfIntegerDuplicates.containsKey(i)){
                noOfIntegerDuplicates.put(i, noOfIntegerDuplicates.getOrDefault(i, 0)+1);
            }else{
                noOfIntegerDuplicates.put(i, 1);
            }
        }

        for(Integer i : noOfIntegerDuplicates.keySet()){
            if(noOfIntegerDuplicates.get(i) == 1){
                return i;
            }
        }
        return 0;
    }

    //Efficient Approach - o(n) Time Complexity, o(1) Space Complexity
    public int returnSingleInteger(int[] inputArray){
        int singleNumber = 0;
        for (int num : inputArray) {
            singleNumber ^= num;
        }
        return singleNumber;
    }

    public static void main(String[] args){
        int[] inputArray = {4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.returnSingleNumber(inputArray));
        System.out.println(singleNumber.returnSingleInteger(inputArray));
    }
}
