package Java8Streams;

import java.util.Arrays;

public class SumOfEvenNumbers {

    public int getSumOfEvenNumbers(int[] input){
        return Arrays.stream(input)
                .filter(num -> num%2 ==0)
                .sum();
    }

    public static void main(String[] args){
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
        System.out.println(sumOfEvenNumbers.getSumOfEvenNumbers(input));
    }
}
