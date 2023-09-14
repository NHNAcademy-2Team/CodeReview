package Unit2_Exercise;

import java.util.Scanner;

public class Exercise {

    /* 
    Exercise 02.1 Write a Java program that creates an object of type String representing your name, and prints the first and the last characters of the string.
    Exercise 02.2 Illustrate by means of a diagram what happens in memory when the program of Exercise 2.1 is executed.
    Exercise 02.3 Modify the Java program in Exercise 2.1 using as few variables as possible.
    Exercise 02.4 Write a Java program that reads from input a non-empty string and prints the string obtained from it by inverting the first and the last characters. Illustrate by means of a diagram what happens in memory when the program is executed.
    Exercise 02.5 Solve Exercise 2.4 using the class StringBuffer. Illustrate by means of a diagram what happens in memory when the program is executed.
    */



    public static void main(String[] args) {

        //2.1 이름 첫글자, 마지막 글자
        String name = new String("양진영");

        String first = name.substring(0, 1);
        String last = name.substring(name.length()-1);

        String result = first.concat(last);
        System.out.println(result);


        //2.3 변수 줄이기
        String name2 = new String("양진영");
        System.out.println(name2.substring(0, 1).concat(name2.substring(name2.length()-1)));


        //2.4 문자열 반전
        Scanner scan = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String input = scan.nextLine();


        String result2 = "";
        for(int i=input.length()-1; i>=0; i--) {
            result2 += input.charAt(i);
        }
        System.out.println("String : " + result2);
        


        //2.5 문자열 반전(StringBuffer 사용)
        StringBuffer sb2 = new StringBuffer();

        for(int i=input.length()-1; i>=0; i--) {
            sb2.append(input.charAt(i));
        }

        System.out.println("StringBuffer : " + sb2.toString());

        scan.close();
    }






    
}
