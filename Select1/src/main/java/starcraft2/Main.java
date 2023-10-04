package starcraft2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("게임을 시작합니다.");
        System.out.print("종족을 골라주세요(1. Terran | 2. Protos | 3. Zerg) : ");
        int choice = scan.nextInt();
        int ran = rnd.nextInt(3) + 1;

        Player player = new Player(choice);
        Computer computer = new Computer(ran);
    }
}
