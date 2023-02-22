package hangman.model;

import static org.junit.Assert.assertEquals;

import javax.swing.JSpinner.NumberEditor;

import org.junit.Test;

/*
 * Clases de equivalencia Original Score:
 * 1. Si incorrectCount es mayor a 10 entonces se retorna un numero negativo
 * 
 * 2. Si cualquiera de los dos, incorrectCount o correctCount son
 * negativos debe saltar una excepcion
 * 
 * 3. Si incorrectCount es menor a 10 y mayor o igual a 0, se resta del puntaje.
 * 
 * Clases de equivalencia Bonus Score:
 * 1. Si en la primera instacia incorrectCount o correctCount es menor de 0 se retornara
 * una excepcion
 * 
 * 2. Si incorrectCount es mayor que el doble de correctCount entonces se retorna una 
 * puntuacion negativa 
 * 
 * Clases de equivalencia PowerBonusScore:
 * 1. En el caso de que la palabra sea de 4 digitos y se adivine el 4 digito
 * el puntaje sera 500
 * 2.
 * 
 */
public class GameScoreTest {
    OriginalScore scoreOriginal = new OriginalScore();
    @Test 
    public void originalScoreTestIncorrectCountGreaterThan10(){
        int result = scoreOriginal.calculateScore(0,11);
        assertEquals(-10 , result);
    }
    @Test
    public void originalScoreTestReduceScore(){
        int result = scoreOriginal.calculateScore(2, 2);
        assertEquals(80, result);
    }
    BonusScore scoreBonus = new BonusScore();
    @Test
    public void bonusScoreTestIncorrectCountDoubleCorrectCount(){
        int result = scoreBonus.calculateScore(2, 5);
        assertEquals(-5, result);
    }
    PowerScore scorePower = new PowerScore();
    @Test
    public void powerScoreTestMaxScore(){
        int result = scorePower.calculateScore(4, 0);
        assertEquals(500, result);
    }
}
