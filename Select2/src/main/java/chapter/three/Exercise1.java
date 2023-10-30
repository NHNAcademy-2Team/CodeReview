package chapter.three;
public class Exercise1 {
    // 두개의 주사위를 굴려 두 주위가 1이 나오는걸 몇번 굴려야 나는 시뮬레이션을 하세요.

    public static void main(String[] args) {
        long count = 0;
        Die die1 = new Die();
        Die die2 = new Die();

        while (true) {
            count++;
            die1.reload();
            die2.reload();
            if (die1.getNum() == 1 && die2.getNum() == 1) {
                break;
            }
        }
        System.out.println("총 " + count + "번을 던져 뱀에 눈이 나왔습니다.");
    }
}

