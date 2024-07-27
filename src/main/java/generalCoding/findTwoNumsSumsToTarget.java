package generalCoding;

public class findTwoNumsSumsToTarget {

    public int[] getTwoNumsSumsToTarget(int[] nums, int target){

        int[] resultNums = new int[2];

        for(int i= 0; i<= nums.length-1; i++){
            for(int j=1; j<= nums.length-1; j++){
                if(target == (nums[i] + nums[j])){
                    resultNums[0] = nums[i];
                    resultNums[1] = nums[j];
                }
            }
        }
        return resultNums;
    }
}
