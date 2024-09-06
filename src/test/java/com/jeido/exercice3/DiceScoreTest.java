package com.jeido.exercice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore ds;
    private IDice dice;

    @BeforeEach
    public void setup() {
        dice = Mockito.mock(IDice.class);
        ds = new DiceScore(dice);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesRolling_5_ThenResult_20() {
        Mockito.when(dice.getRoll()).thenReturn(5).thenReturn(5);
        int awaited = 5 * 2 + 10;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesRolling_6_ThenResult_30() {
        Mockito.when(dice.getRoll()).thenReturn(6).thenReturn(6);
        int awaited = 30;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }

    @Test
    public void testDiceScoreWhenGetScore_2_DicesRolling_1_2_ThenResult_2() {
        Mockito.when(dice.getRoll()).thenReturn(1).thenReturn(2);
        int awaited = 2;

        int result = ds.getScore();

        Assertions.assertEquals(awaited, result);
    }
}
