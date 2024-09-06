package com.jeido.exercice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore ds;
    private final IDice dice = Mockito.mock(IDice.class);

    @BeforeEach
    public void setup() {
        ds = new DiceScore(dice);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesIdenticalRoll_ThenResult_DiceGetRollTimes2Plus10() {
        Mockito.when(dice.getRoll()).thenReturn(2);
        int awaited = 2 * 2 + 10;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesRoll6_ThenResult_30() {
        Mockito.when(dice.getRoll()).thenReturn(6);
        int awaited = 30;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesRoll_ThenResult_Max() {
        Mockito.when(dice.getRoll()).thenReturn(1, 2);
        int awaited = 2;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }
}
