package chapter.four;

import java.util.Scanner;

public class Exercise2 {
    public static int hexValue(char ch){

        if(ch >= '0' && ch <= '9'){
            String temp = String.valueOf(ch);
            int x = Integer.parseInt(temp);
            return x;
        } else {
            switch(ch){
                case 'A', 'a':
                    return 10;
                case 'B', 'b':
                    return 11;
                case 'C', 'c':
                    return 12;
                case 'D', 'd':
                    return 13;
                case 'E', 'e':
                    return 14;
                case 'F', 'f':
                    return 15;
                default:
                    return -1;
            }
        }
    };

    public static int hex2Dec(String sentence){
        int i = 0;
        int value = 0;

        while(i < sentence.length()){
            if(hexValue(sentence.charAt(i)) == -1){
                throw new IllegalArgumentException("변환할 수 없는 문자 입니다.");
            } else {
                value = value * 16 + hexValue( sentence.charAt(i) );
            }
            i++;
        }
        return value;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(hex2Dec(sentence));

        scanner.close();
    }
}
