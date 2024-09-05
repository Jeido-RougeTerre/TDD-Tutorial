package com.jeido.exercice2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FibTest {
    private Fib fib;

    @Test
    public void testFibWhenGetFibSeries_Range_1_ThenResult_NotEmpty() {
        fib =  new Fib(1);

        List<Integer> fibSeries = fib.getFibSeries();

        Assertions.assertFalse(fibSeries.isEmpty());
    }

    @Test
    public void testFibWhenGetFibSeries_Range_1_ThenResult_Contains_0() {
        fib =  new Fib(1);
        int awaited = 0;

        List<Integer> fibSeries = fib.getFibSeries();

        Assertions.assertTrue(fibSeries.contains(awaited));
    }

    @Test
    public void testFibWhenGetFibSeries_Range_6_ThenResult_Contains_3() {
        fib =  new Fib(6);
        int awaited = 3;

        List<Integer> fibSeries = fib.getFibSeries();

        Assertions.assertTrue(fibSeries.contains(awaited));
    }

    @Test
    public void testFibWhenGetFibSeries_Range_6_ThenResult_Contains_6_Elements() {
        fib =  new Fib(6);
        int awaitedSize = 6;

        List<Integer> fibSeries = fib.getFibSeries();

        Assertions.assertEquals(fibSeries.size(), awaitedSize);
    }

    @Test
    public void testFibWhenGetFibSeries_Range_6_ThenResult_NotContains_4() {
        fib =  new Fib(6);
        int notAwaited = 4;

        List<Integer> fibSeries = fib.getFibSeries();

        Assertions.assertFalse(fibSeries.contains(notAwaited));
    }

    @Test
    public void testFibWhenGetFibSeries_Range_6_ThenResult_Contains_0_1_1_2_3_5() {
        fib =  new Fib(6);
        List<Integer> integersAwaited = List.of(2,3,5,0,1,1);

        List<Integer> fibSeries = fib.getFibSeries();
        boolean flag = true;
        for (Integer i : integersAwaited) {
            flag = flag && fibSeries.contains(i);
        }

        Assertions.assertTrue(flag);
    }

    @Test
    public void testFibWhenGetFibSeries_Range_6_ThenResult_Contains_0_1_1_2_3_5_ascendOrder() {
        fib =  new Fib(6);
        List<Integer> integersAwaited = List.of(0,1,1,2,3,5);

        List<Integer> fibSeries = fib.getFibSeries();
        boolean flag = true;
        for (int i = 0; i < fibSeries.size(); i++) {
            flag = flag && fibSeries.get(i).equals(integersAwaited.get(i));
        }

        Assertions.assertTrue(flag);
    }
}
