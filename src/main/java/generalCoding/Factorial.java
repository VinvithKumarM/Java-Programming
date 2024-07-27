package generalCoding;

public class Factorial {
    public int getFactorial(int input) {

        /*
         * the product of an integer and all the integers below it;
         * e.g. factorial four ( 4! ) is equal to 24.*/

        if (input == 0 || input == 1) {
            return 1;
        }
        return input * getFactorial(input - 1);
    }
}
