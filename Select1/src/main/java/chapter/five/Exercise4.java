package chapter.five;


import java.util.Scanner;

public class Exercise4 {
    public static int compareLength(int length1, int length2, int length3) {
        int max = 0;
        int middle = 0;
        int min = 0;
        if (length1 > length2) {
            max = length1;
            if (length3 > length1) {
                max = length3;
                middle = length1;
                min = length2;
                if (max < (length1 + length2)) {
                    System.out.println("삼각형 조건이 성립됩니다.");
                } else
                    System.out.println("삼각형 조건이 성립되지 않습니다.");
            }

            if (max == length1) {
                if (length2 > length3) {
                    middle = length2;
                    min = length3;
                }
                if (max < (length3 + length2)) {
                    System.out.println("삼각형 조건이 성립됩니다.");
                } else
                    System.out.println("삼각형 조건이 성립되지 않습니다.");

            }

        }
        if (length1 < length2) {
            max = length2;

            if (length3 > length2) {
                max = length3;
                middle = length2;
                min = length1;
                if (max < (length1 + length2)) {
                    System.out.println("삼각형 조건이 성립됩니다.");
                } else
                    System.out.println("삼각형 조건이 성립되지 않습니다.");
            }
            if (max == length2) {
                if (length1 > length3) {
                    middle = length1;
                    min = length3;
                }
                if (max < (length3 + length1)) {
                    System.out.println("삼각형 조건이 성립됩니다.");
                } else
                    System.out.println("삼각형 조건이 성립되지 않습니다.");
            }

        }

        return max + middle + min;

    }

    public static void triangleArea(int s, int length1, int length2, int length3) {
        double area = Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
        System.out.println("삼각형 넓이는 " + area);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length1 = scn.nextInt();
        int length2 = scn.nextInt();
        int length3 = scn.nextInt();

        System.out.println("삼각형 둘레는 " + compareLength(length1, length2, length3) + "입니다.");
        int s = compareLength(length1, length2, length3) / 2;
        triangleArea(s, length1, length2, length3);
        scn.close();
    }
}
