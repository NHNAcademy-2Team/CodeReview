package chapter.three;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import chapter.three.exercise1.Dice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExerciseOneTest {
    @DisplayName("주사위의 눈의 최댓값이 1보다 작은 경우")
    @Test
    public void diceTest(){
        assertThrows(IllegalArgumentException.class, () -> new Dice(-2));

    }
}
