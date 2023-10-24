package unit.nine;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * Exercise 09.2 Determine whether the following program will generate (i) compilation errors, (ii) runtime errors. If the program does not generate errors, say what it will print out; if the program generates errors, correct them and say what it will print out after the correction. Motivate your answers.
 * <p>
 * 런타임 오류
 * 101 print
 */
public class Exercise2 {
    private int x = 101;

    private void f(int x) {
        this.x = x + 1;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        int x = 200;
        e.f(x);
    }
}

