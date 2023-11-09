package chapter.five;

public class AdditionQuestion {

    private int a, b;  // 문제에 포함된 숫자들.

    public AdditionQuestion() { // 생성자
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

}
