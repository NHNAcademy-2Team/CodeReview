package unit.five;

public class Exercise2 {
    public void exereise2(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            System.out.println("It is irregular");
        }
        if ((a == b) == (a != c) || (b == c) == (a != b) || (a == c) == (b != c)) {
            System.out.println("It is symmetric");
        }
        if (a ==b||b==c||a==c){
            System.out.println("It is regular");
        }
    }
}
