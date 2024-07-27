package generalCoding;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondLargestNumber {

    public int getSecondLargestNumber(){
        Integer[] numbers = {23, 19, 45, 33, 19, 77};
        List<Integer> uniqueNumbers = Arrays.stream(numbers).distinct().sorted().toList();
        return uniqueNumbers.reversed().get(1);
    }
}
