package goldmanSachs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MergeIntervals {

    public void merge(){
        int[][] intervals = {{6,8}, {1,9}, {2,4}, {4,7}};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(6,8);
        treeMap.put(1,9);
        treeMap.put(2,4);
        treeMap.put(4,7);
        System.out.println("\nTreeMap (ordered by keys):");
        System.out.println(treeMap);
        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){

        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
    }
}
