package chapter.five;

import chapter.five.exercise2.StatCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExerciseOneTest {
    @Test
    @DisplayName("StatCalc의 Count 함수")
    void testCount(){
        StatCalc calc = new StatCalc();
        calc.enter(1);
        calc.enter(2);
        calc.enter(3);
        Assertions.assertEquals(3, calc.getCount());
    }

    @Test
    @DisplayName("StatCalc의 Sum 함수")
    void testSum(){
        StatCalc calc = new StatCalc();
        calc.enter(1);
        calc.enter(2);
        calc.enter(3);
        Assertions.assertEquals(6, calc.getSum());
    }

    @Test
    @DisplayName("StatCalc의 Mean 함수")
    void testMean(){
        StatCalc calc = new StatCalc();
        calc.enter(2);
        calc.enter(3);
        calc.enter(4);
        Assertions.assertEquals(3, calc.getMean());
    }

    @Test
    @DisplayName("StatCalc의 StandardDeviation 함수")
    void testStandardDeviation(){
        StatCalc calc = new StatCalc();
        calc.enter(1);
        calc.enter(2);
        calc.enter(3);
        Assertions.assertEquals(Math.round(Math.sqrt((double) 2 /3) * 1000) / 1000.0, Math.round(calc.getStandardDeviation() * 1000) / 1000.0);
    }

    @Test
    @DisplayName("StatCalc의 Max 함수")
    void testMax(){
        StatCalc calc = new StatCalc();
        calc.enter(2);
        calc.enter(3);
        calc.enter(4);
        Assertions.assertEquals(4, calc.getMax());
    }

    @Test
    @DisplayName("StatCalc의 Min 함수")
    void testMin(){
        StatCalc calc = new StatCalc();
        calc.enter(2);
        calc.enter(3);
        calc.enter(4);
        Assertions.assertEquals(2, calc.getMin());
    }
}
