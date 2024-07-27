package generalCoding;

public class LargestNumber {

    public int getLargestNumber(){
        int[] nums = {3,1, 2, 7,0};
        int max = nums[0];
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
