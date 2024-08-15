package generalCoding;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        reverseAString.reverse("guru");
        SwapTwoNumWithoutThirdVariable swapTwoNumWithoutThirdVariable = new SwapTwoNumWithoutThirdVariable();
        swapTwoNumWithoutThirdVariable.swap(-17, 2);
        CheckPresenceOfVowelInString checkPresenceOfVowelInString = new CheckPresenceOfVowelInString();
        System.out.println(checkPresenceOfVowelInString.presenceOfVowel("guru"));
        CheckNumIsPrime checkNumIsPrime = new CheckNumIsPrime();
        System.out.println("Is prime ? "+checkNumIsPrime.isPrime(19));
        Inheritance inheritance = new Inheritance();
        Inheritance.Cat cat = new Inheritance.Cat();
        cat.meow();
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        String x = "abc";
        String y = "abc";

        x.concat(y);

        System.out.println(x);
        LargestNumber largestNumber = new LargestNumber();
        System.out.println("Max number : "+largestNumber.getLargestNumber());
        Factorial factorial = new Factorial();
        System.out.println("Factorial of a number : "+factorial.getFactorial(4));
        CheckStringsAreAnagrams checkStringsAreAnagrams = new CheckStringsAreAnagrams();
        System.out.println("Anagram with Sorting Approach : "+checkStringsAreAnagrams.checkAnagram("graham graham", "hrgmaahrgmaa "));
        System.out.println("Anagram with Frequency Count Approach : "+checkStringsAreAnagrams.checkAnagramUsingFrequencyCountApproach("graham", "hrgmaa"));
        sumOfDigitsOfANumber sumOfDigitsOfANumber = new sumOfDigitsOfANumber();
        System.out.println("Sum of digits in a number is : "+sumOfDigitsOfANumber.getSumOfDigits("75063"));
        findLongestString findLongestString = new findLongestString();
        String[] fruits = {"apple", "banana", "orange", "kiwi", "strawberry"};
        System.out.println("longest String is : "+findLongestString.getLongestString(fruits));
        int[] nums = {3, 8, 7, 4, 2, 6};
        int target = 10;
        findTwoNumsSumsToTarget findTwoNumsSumsToTarget = new findTwoNumsSumsToTarget();
        System.out.println("find two nums sums to target : "+ Arrays.toString(findTwoNumsSumsToTarget.getTwoNumsSumsToTarget(nums, target)));
        String s = "(){}[]<>";
        checkStringIsBalancedCharacters checkStringIsBalancedCharacters = new checkStringIsBalancedCharacters();
        System.out.println("String is balanced ? "+checkStringIsBalancedCharacters.checkStringIsBalancedOrNot(s));
        countOccurrencesOfEachChar countOccurrencesOfEachChar = new countOccurrencesOfEachChar();
        System.out.println("get count of each occurrences : "+countOccurrencesOfEachChar.getCountOccurrences());
        countOfCharacters countOfCharacters = new countOfCharacters();
        System.out.println("Count of Characters String is : "+countOfCharacters.getCountOfChars());
    }
}
