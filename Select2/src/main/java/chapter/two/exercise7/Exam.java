package chapter.two.exercise7;

public class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
        classInvariant();
    }

    private void classInvariant() {
        if (this.score < 0) {
            throw new IllegalArgumentException("음수입니다.");
        }
    }

    public int getScore() {
        return score;
    }
}
