package chapter2;
import java.io.*;
import java.util.Scanner;

public class Exercise7 {
    // testdata.txt라는 이름에 파일정보는 다음과 같다. 첫줄은 학생이름, 다음 세줄은 각각 정수이고 세번시험본 각각에 점수들이다.
    // 학생이름과 성적 평균을 출력하시오. 더 나아가 입력하여 파일을 저장하시오.
    public static void main(String[] args) throws IOException {

        String name;
        int exam1, exam2, exam3;
        double average;
        //---
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요. : ");
        name = sc.nextLine();
        System.out.println("첫번째 점수를 입력하세요. : ");
        exam1 = sc.nextInt();
        System.out.println("두번째 점수를 입력하세요. : ");
        exam2 = sc.nextInt();
        System.out.println("세번째 점수를 입력하세요. : ");
        exam3 = sc.nextInt();

        FileWriter fw = new FileWriter("testdata.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(name);
        pw.println(exam1);
        pw.println(exam2);
        pw.println(exam3);

        pw.close();
        fw.close();
        //---

        FileReader fr = new FileReader("testdata.txt");
        BufferedReader br = new BufferedReader(fr);

        name = br.readLine();
        exam1 = Integer.valueOf(br.readLine());
        exam2 = Integer.valueOf(br.readLine());
        exam3 = Integer.valueOf(br.readLine());

        fr.close();
        average = (double)(exam1 + exam2 + exam3) / 3;

        System.out.println("학생 이름 : " + name);
        System.out.printf("학생 점수 평균 : %.2f", average);
        sc.close();
    }
}
