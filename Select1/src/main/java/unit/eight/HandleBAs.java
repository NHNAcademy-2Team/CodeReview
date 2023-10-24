package unit.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandleBAs {
    //보류
    //은행 계좌 집합
    private String name;    //이름
    private String surname; //성
    private double balance; //잔고
    private String filename;
    private File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/" + filename);

    public HandleBAs(String filename) {
        this.filename = filename;
    }

    public void interests(double rate) {
        this.balance += this.balance * rate;
    }

    public void printNegative() {
//        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
//
//            String line = br.readLine();
//            while((line = br.readLine()) != null) {
//
//
//            }
//
//        } catch (IOException e) {
//            System.out.println("올바른 입력값이 아닙니다.");
//        }
    }
}
