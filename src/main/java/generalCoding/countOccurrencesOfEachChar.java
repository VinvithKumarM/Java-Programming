package generalCoding;

import java.util.*;

public class countOccurrencesOfEachChar {

    public HashMap<Character, Integer> getCountOccurrences() {
        String input = "coodinng";
        System.out.println(input.toCharArray());

        //Step1 : Get counts of characters occurrences and put into a Map
        HashMap<Character, Integer> charCountsMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountsMap.put(c, charCountsMap.getOrDefault(c, 0) + 1);
        }

        // Step 2 : Sort the map by values in desc order using LinkedHashMap
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(charCountsMap.entrySet());
        // Sort the list based on values in descending order using comparator
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Step 3 : Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Step 4 : Display the sorted map
        System.out.println("HashMap sorted by values in ascending order:");
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return charCountsMap;
    }
}
