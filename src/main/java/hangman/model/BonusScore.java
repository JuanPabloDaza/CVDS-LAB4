package hangman.model;

public class BonusScore implements GameScore {
    public BonusScore(){
    }
    /* 
     * method: calculateScore
     * purpose: Used to calculate the score from the bonus score 
     * system
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return (correctCount * 10) - (incorrectCount * 5);
    }    
}
