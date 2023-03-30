package pl.bartek.calculator.service;

public class PrimeNumbersService {
    public String printPrimeNumbers(int minNumberOfRange, int maxNumberOfRange) {

        int beginingOfRange = Math.max(Math.min(minNumberOfRange, maxNumberOfRange), 2);
        int endOfRange = Math.max(minNumberOfRange, maxNumberOfRange);
        String primeNumbers = "";
        for (int i = beginingOfRange; i <= endOfRange; i++) {
            boolean isPrimeNumber = true;
            int minDividingNumber = 2;
            int maxDividingNumber = i - 1;
            for (int j = minDividingNumber; j <= maxDividingNumber; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primeNumbers += " "+ String.valueOf(i);
            }
        }
        return primeNumbers;
    }
}
