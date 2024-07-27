package generalCoding;

public class sumOfDigitsOfANumber {

    public int getSumOfDigits(String input) {
        int sum = 0;
        if (input.length() == 1) return Integer.parseInt(input);
        for (int i = 0; i <= input.length() - 1; i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            sum += digit;
        }
        return sum;

    }
}
