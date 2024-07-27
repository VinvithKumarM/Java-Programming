package generalCoding;

public class findLongestString {

    public String getLongestString(String[] fruits) {
        //   String[] fruits = {"apple", "banana", "orange", "kiwi", "strawberry"};
        if (fruits.length == 1) return fruits[0];
        String longestString = "";
        for (String s : fruits) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
        return longestString;
    }
}
