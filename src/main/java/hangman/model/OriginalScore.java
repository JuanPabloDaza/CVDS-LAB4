package hangman.model;

public class OriginalScore implements GameScore {
    public OriginalScore(){    
    }
    /*
    * method: calculateScore
    * purpose: Used for calculate the score from 
    * a game that is using the original score system 
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return 100 - (incorrectCount * 10);
    }
}
