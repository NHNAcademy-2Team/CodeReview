package unit.five;

public class Exercise5 {
    int a;
    int b;
    int c;

    public Exercise5(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void equation() {
        double x;
        double y;
        x = (-1 * b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
        y = (-1 * b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
        System.out.println("x = " + x + " , " + y);
    }

}
