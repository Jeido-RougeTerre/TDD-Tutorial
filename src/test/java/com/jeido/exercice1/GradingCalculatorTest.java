package com.jeido.exercice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GradingCalculatorTest {

    private GradingCalculator calculator;
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_95_90_ThenResult_A() {
//        calculator = new GradingCalculator(95, 90);
//        char awaited = 'A';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_85_90_ThenResult_B() {
//        calculator = new GradingCalculator(85, 90);
//        char awaited = 'B';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_65_90_ThenResult_C() {
//        calculator = new GradingCalculator(65, 90);
//        char awaited = 'C';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_95_65_ThenResult_B() {
//        calculator = new GradingCalculator(95, 65);
//        char awaited = 'B';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_95_55_ThenResult_F() {
//        calculator = new GradingCalculator(95, 55);
//        char awaited = 'F';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_65_55_ThenResult_F() {
//        calculator = new GradingCalculator(65, 55);
//        char awaited = 'F';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }
//
//    @Test
//    public void testGradingCalculatorWhenGetGrade_50_90_ThenResult_F() {
//        calculator = new GradingCalculator(50, 90);
//        char awaited = 'F';
//
//        char result = calculator.getGrade();
//
//        Assertions.assertEquals(awaited, result);
//    }

    @ParameterizedTest
    /*@CsvSource({
            "95,90,A",
            "85,90,B",
            "65,90,C",
            "95,65,B",
            "95,55,F",
            "65,55,F",
            "50,90,F"
    })*/
    @MethodSource("parametersProvider")
    public void testGradingCalculatorWhenGetGradeScoreAndAttendancePercentageThenResultAwaitedGrade(int score, int attendancePercentage, char awaitedGrade) {
        calculator = new GradingCalculator(score, attendancePercentage);

        char result = calculator.getGrade();

        Assertions.assertEquals(awaitedGrade, result);
    }

    private static Stream<Arguments> parametersProvider() {
        return Stream.of(
                Arguments.of(95, 90, 'A'),
                Arguments.of(85, 90, 'B'),
                Arguments.of(65, 90, 'C'),
                Arguments.of(95, 65, 'B'),
                Arguments.of(95, 55, 'F'),
                Arguments.of(65, 55, 'F'),
                Arguments.of(50, 90, 'F')
        );
    }

}
