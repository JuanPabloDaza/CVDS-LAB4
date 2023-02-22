package hangman.model;

import javax.sound.sampled.Port;

public class PowerScore implements GameScore {
    public PowerScore(){
    }
    /* 
     * method: calculateScore
     * purpose: Used to calculate the score from the
     * Power Score system
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int result = ((int)Math.pow(5, correctCount)) - (incorrectCount * 8);
        if(result > 500){
            return 500;
        }else{
            return result;
        }
    }
}