package pl.bartek.calculator.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ServiceFibonacciCount {

    public Collection<Long> countFibonacci(int howManyNumbers) {
        List<Long> fibonacciNumbers = new ArrayList<>();
        long firstNumber = 0;
        long secondNumber = 1;
        if (howManyNumbers == 1) {
            fibonacciNumbers.add(firstNumber);
        }
        if (howManyNumbers >= 2) {
            fibonacciNumbers.add(secondNumber);
        }
        if (howManyNumbers > 2) {
            for (int i = 2; i < howManyNumbers; i++) {
                long thirdNumber = firstNumber + secondNumber;
                fibonacciNumbers.add(thirdNumber);
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }

        return Collections.unmodifiableList(fibonacciNumbers);
    }
}