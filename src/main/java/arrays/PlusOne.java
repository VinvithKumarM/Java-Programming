package arrays;

import java.util.Arrays;

public class PlusOne {

    public int[] arrayOfDigitsOfIncrementedNumber(){
        int[] digits = {1,2,3};
        //convert {1,2,3} to 123 String
        String b = Arrays.stream(Arrays.stream(digits)
                .mapToObj(Integer::toString) // Convert int to String
                .toArray(String[]::new))// Collect into String[]
                .reduce(String::concat).toString();
        int i = Integer.parseInt(b)+1;
        return convertToDigitsArray(i);
    }

    public static int[] convertToDigitsArray(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Initialize an array to store the digits
        int[] digitsArray = new int[numberStr.length()];

        // Fill the array with digits
        for (int i = 0; i < numberStr.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        return digitsArray;
    }

    public static void main(String[] args){
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.arrayOfDigitsOfIncrementedNumber()));
    }
}
