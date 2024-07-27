package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public Set<Integer> removeDuplicates(Integer[] inputArray) {
        return Arrays.stream(inputArray).collect(Collectors.toSet());
    }
}
