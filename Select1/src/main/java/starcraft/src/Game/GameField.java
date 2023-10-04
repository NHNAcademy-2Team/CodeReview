package Game;

import java.util.Scanner;

public class GameField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameSystem gameSystem = new GameSystem();

        System.out.println("Game start!");
        gameSystem.createGame(scanner);

        scanner.close();
    }
}
