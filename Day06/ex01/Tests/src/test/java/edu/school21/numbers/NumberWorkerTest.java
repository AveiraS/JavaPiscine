package edu.school21.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberWorkerTest {

    NumberWorker test = new NumberWorker();

    @ParameterizedTest
    @ValueSource(ints = { 13, 3, 11, 2})
    void isPrimeForPrimes (int isPrime) {
        Assertions.assertTrue(test.isPrime(isPrime));
    }

    @ParameterizedTest
    @ValueSource(ints = { 10, 15, 69, 4 })
    void isPrimeForNotPrimes(int isNoPrime) {
        Assertions.assertFalse(test.isPrime(isNoPrime));
    }

    @ParameterizedTest
    @ValueSource(ints = { -5, 1, 0, -300 })
    void isPrimeForIncorrectNumbers(int number) {
        Assertions.assertThrows(IllegalNumberException.class, () -> test.isPrime(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void isDigitsSumCorrect(int first, int second) {
        Assertions.assertEquals(test.digitsSum(first), second);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_fails.csv")
    void isDigitsSumInCorrect(int first, int second) {
        Assertions.assertNotEquals(test.digitsSum(first), second);
    }

}
