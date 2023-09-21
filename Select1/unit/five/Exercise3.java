package unit.five;

public class Exercise3 {
    public void exereise3(int a, int b, int c) {
        if (a != b || a!=c || b!=c) {
            System.out.println("irregular");
        }else if (a == b && b == c && a == c) {
            System.out.println("regular");
        }else {
            System.out.println("symmetric");
        }
    }
}
