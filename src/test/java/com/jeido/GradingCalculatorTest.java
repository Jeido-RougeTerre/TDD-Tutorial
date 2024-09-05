package com.jeido;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {

    private GradingCalculator calculator;

    @Test
    public void testGradingCalculatorWhenGetGrade_95_90_ThenResult_A() {
        calculator = new GradingCalculator(95, 90);
        char awaited = 'A';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_85_90_ThenResult_B() {
        calculator = new GradingCalculator(85, 90);
        char awaited = 'B';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_65_90_ThenResult_C() {
        calculator = new GradingCalculator(65, 90);
        char awaited = 'C';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_95_65_ThenResult_B() {
        calculator = new GradingCalculator(95, 65);
        char awaited = 'B';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_95_55_ThenResult_F() {
        calculator = new GradingCalculator(95, 55);
        char awaited = 'F';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_65_55_ThenResult_F() {
        calculator = new GradingCalculator(65, 55);
        char awaited = 'F';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testGradingCalculatorWhenGetGrade_50_90_ThenResult_F() {
        calculator = new GradingCalculator(50, 90);
        char awaited = 'F';

        char result = calculator.getGrade();

        Assertions.assertEquals(awaited, result);
    }
}
