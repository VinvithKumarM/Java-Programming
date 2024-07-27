package generalCoding;

public class CheckNumIsPrime {

    public boolean isPrime(int inputNumber) {

        /*
         * a whole number greater than 1 that cannot be exactly divided by any
         * whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11)
         * */

        if (inputNumber == 0 || inputNumber == 1) {
            return false;
        }
        if (inputNumber == 2) {
            return true;
        }
        for (int i = 2; i <= inputNumber / 2; i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
