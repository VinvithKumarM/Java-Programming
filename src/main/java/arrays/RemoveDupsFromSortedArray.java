package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupsFromSortedArray {

    public int[] removeDuplicates() {
        int[] inputArray = {1,1,2};
        return Arrays.stream(inputArray).distinct().toArray();
    }

    public int removeDuplicatesAndSendCount(int[] nums){
        int left = 0;
        int right = 1;
        while(right< nums.length){
            if(nums[left] != nums[right]){
                nums[left+1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }
}
