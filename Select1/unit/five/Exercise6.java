package unit.five;

import java.util.Scanner;

public class Exercise6 {

//    Exercise 05.6: YES/NO 질문 (물음표 없이)을 입력으로 받고 다음 규칙에 따라 질문에 답변하는 프로그램을 작성하세요.
//
//    라인이 모음으로 시작하면 답변은 "MAYBE"입니다.
//    라인의 마지막 글자가 "a", "i" 또는 "u"이면 답변은 "YES"입니다.
//    라인의 마지막 글자가 "e" 또는 "o"이면 답변은 "NO"입니다.
//    라인의 마지막 글자가 "a", "e", "i", "o", "u" 이외의 문자라면 답변은 "DON'T KNOW"입니다.
//            참고: 두 규칙을 적용할 때 답변은 두 규칙의 답변을 연결하여 얻습니다.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] rule = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("물음표 없이 YES/NO 질문을 작성해주세요 : ");
        String question = scan.nextLine().toLowerCase();

        for(int i=0; i<rule.length; i++) {
            if (question.charAt(0) == rule[i]) {
                System.out.print("MAYBE ");
            }
        }

        switch (question.charAt(question.length()-1)) {
            case 'a':
            case 'i':
            case 'u':
                System.out.println("YES");
                break;
            case 'e':
            case 'o':
                System.out.println("NO");
                break;
            default:
                System.out.println("DON'T KNOW");
        }



    }
}
