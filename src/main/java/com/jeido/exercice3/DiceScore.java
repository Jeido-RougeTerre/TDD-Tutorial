package com.jeido.exercice3;

public class DiceScore {
    private final IDice dice;

    public DiceScore(IDice dice) {
        this.dice = dice;
    }

    public int getScore() {
        int scoreFirst = dice.getRoll();
        int scoreSecond = dice.getRoll();

        if (scoreFirst == scoreSecond) {
            if (scoreFirst == 6) {
                return 30;
            }
            return scoreFirst * 2 + 10;
        }
        return Math.max(scoreFirst, scoreSecond);

    }
}
