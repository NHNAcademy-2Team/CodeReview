package Select1.Unit05;

import java.util.Scanner;

public class Discriminant {
    public static void discriminant(double a, double b, double c) {
        double discriminant, root1, root2;

        discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("근은 " + root1 + "과 " + root2 + "입니다.");
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("중근은 " + root1 + "입니다.");
        } else {
            System.out.println("실근이 존재하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b, c;

        System.out.print("이차방정식 계수 a는 ");
        a = scn.nextDouble();

        System.out.println();
        System.out.print("이차방정식 계수 b는 ");
        b = scn.nextDouble();

        System.out.println();
        System.out.print("이차방정식 계수 c는 ");
        c = scn.nextDouble();

        discriminant(a, b, c);

        scn.close();
    }
}
