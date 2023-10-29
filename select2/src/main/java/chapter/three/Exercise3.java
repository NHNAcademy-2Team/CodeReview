package Select2.src.main.java.chapter.three;

public class Exercise3 {
    public static void main(String[] args) {
        double first;
        char operator;
        double second;
        double result = 0.0;

        while (true) {
            first = textio.Textio.getDouble();
            if (first == 0) {
                break;
            }
            operator = textio.Textio.getChar();
            second = textio.Textio.getlnDouble();

            switch (operator) {
                case '+':
                    result = first + second;
                case '-':
                    result = first - second;
                case '*':
                    result = first * second;
                case '/':
                    result = first / second;
                default:
                    System.out.println("잘못된 연산자입니다. ");

            }
            System.out.print("결과: " + result);

        }

    }
}
