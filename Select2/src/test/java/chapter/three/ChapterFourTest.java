package chapter.three;

import chapter.four.exercise8.Exercise8;
import java.io.InputStreamReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChapterFourTest {
    @Test
    @DisplayName("Exercise8 오류 확인")
    public void exception(){
        assertThrows(NumberFormatException.class, () -> {
            }
        );
    }
}
