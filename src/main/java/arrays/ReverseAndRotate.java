package arrays;

import java.util.Arrays;

public class ReverseAndRotate {

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArray(int[] arrayToRotate, int noOfRotations){
        noOfRotations %= arrayToRotate.length;
        reverse(arrayToRotate, 0, arrayToRotate.length-1);
        reverse(arrayToRotate, 0, noOfRotations-1);
        reverse(arrayToRotate, noOfRotations, arrayToRotate.length-1);
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        ReverseAndRotate reverseAndRotate = new ReverseAndRotate();
        reverseAndRotate.rotateArray(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
