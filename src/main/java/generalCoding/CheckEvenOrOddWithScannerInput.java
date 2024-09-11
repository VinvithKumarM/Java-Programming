package generalCoding;

import java.util.*;

public class CheckEvenOrOddWithScannerInput {

    public static void main(String[] args) {

        CheckEvenOrOddWithScannerInput checkEvenOrOddWithScannerInput = new CheckEvenOrOddWithScannerInput();
        checkEvenOrOddWithScannerInput.checkEvenOrOdd();

    }

    public void checkEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber = sc.nextInt();
        String firstNumberResult = checkNumber(firstNumber);
        System.out.println("FirstNumber is " + firstNumberResult);
        System.out.println("Enter Second Number");
        int secondNumber = sc.nextInt();
        String secondNumberResult = checkNumber(secondNumber);
        System.out.println("secondNumber is " + secondNumberResult);
    }

    public String checkNumber(int input) {
        if (input % 2 == 0) {
            return "Number is Even";
        }
        return "Number is odd";
    }
}
