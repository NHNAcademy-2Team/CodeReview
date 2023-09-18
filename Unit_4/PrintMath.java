import java.util.Scanner;

public class PrintMath {
    public static void printNumber(double x, double y) {
        System.out.println("산술 평균 : " + arithmeticMean(x, y));
        System.out.println("기하 평균 : " + geometricMean(x, y));
        System.out.println("큰 수 : " + Math.max(x, y));
        System.out.println("작은 수 : " + Math.min(x, y));
    }

    public static double arithmeticMean(double x, double y) {
        return (x + y) / 2.0;
    }

    public static double geometricMean(double x, double y) {
        return Math.sqrt(x + y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        printNumber(x, y);

        scanner.close();
    }
}
