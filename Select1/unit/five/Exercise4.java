package unit.five;
public class Exercise4 {
    int a;
    int b;
    int c;

    public Exercise4() {
    }

    public Exercise4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        list();
    }

    public void list() {
        int m;
        if (b < c) {
            m = b;
            b = c;
            c = m;
        }
        if (a < b) {
            m = a;
            a = b;
            b = m;
        }
        if (b < c) {
            m = b;
            b = c;
            c = m;
        }
    }

    public void checkTriangle() {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("삼각형이 되지 않습니다.");
        } else if (b + c < a) {
            System.out.println("삼각형이 되지 않습니다.");
        } else {
            // 삼각형이 되었습니다.
        }
    }

    public void round() {
        System.out.println("삼각형의 둘레는 : " + (a + b + c));
    }

    public void area() {
        double s = (a + b + c) / 2;
        System.out.println("삼각형의 면적 : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public void category() {
        if (a != b || a != c || b != c) {
            System.out.println("irregular");
        } else if (a == b && b == c && a == c) {
            System.out.println("regular");
        } else {
            System.out.println("symmetric");
        }
    }
}
