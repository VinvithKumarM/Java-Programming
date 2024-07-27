package goldmanSachs;

import java.util.*;

public class IntegerFrequencies {

    public boolean getIntegerFrequencies(int[] arr) {
        HashMap<Integer, Integer> numbersFrequenciesMap = new HashMap<>();

        //Step1 : Put the integer and their count in a Hashmap
        for (int i = 0; i <= arr.length - 1; i++) {
            int a = arr[i];
            if (numbersFrequenciesMap.containsKey(a)) {
                numbersFrequenciesMap.put(a, numbersFrequenciesMap.get(a) + 1);
            } else {
                numbersFrequenciesMap.put(a, 1);
            }
        }
        System.out.println(numbersFrequenciesMap);

        //Step2 : Put all the frequencies of Integers into a set.
        Set<Integer> frequencySet = new HashSet<>();
        for (Integer i : numbersFrequenciesMap.keySet()) {
            frequencySet.add(numbersFrequenciesMap.get(i));
        }

        //Step3 : If frequencies of all the integers are different,
        //the size of set should be same as hashmap size
        return frequencySet.size() == numbersFrequenciesMap.size();
    }

}
