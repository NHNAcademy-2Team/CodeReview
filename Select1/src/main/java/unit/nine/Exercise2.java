package nine;

public class Exercise2 {
    // 수정 후
    private int x = 101;

    private void f(int x) {
        this.x = x;
        this.x++;
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

    // 수정 전 -> 컴파일 오류, 런타임 오류는 생기지 않는다.
    // 하지만 x = 200을 넣은 상태에서 f(x)함수를 호출했을 때 x의 값이 증가해서 출력되는 것이 아닌 101이 출력된다.

    // private int x = 101;

    // private void f(int x) {
    // x++;
    // g();
    // }

    // private void g() {
    // System.out.println(x);
    // }

    // public static void main(String[] args) {
    // Exercise2 e = new Exercise2();
    // int x = 200;
    // e.f(x);
    // }
}
