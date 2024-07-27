package generalCoding;

import java.util.Arrays;

public class CheckStringsAreAnagrams {

    public boolean checkAnagram(String firstString, String secondSting) {
        // Approach 1 : Sorting Approach

        if (firstString.length() != secondSting.length())
            return false;

        //Step1 -> convert String to char array
        char[] firstStringChars = firstString.toCharArray();
        char[] secondStringChars = secondSting.toCharArray();

        //Step2 -> sort char array
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);

        //Step3 -> check Equals of two char arrays
        return Arrays.equals(firstStringChars, secondStringChars);
    }

    public boolean checkAnagramUsingFrequencyCountApproach(String firstString, String secondSting) {
        if (firstString.length() != secondSting.length())
            return false;

        int[] charCount = new int[26];

        for (char c : firstString.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : secondSting.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
