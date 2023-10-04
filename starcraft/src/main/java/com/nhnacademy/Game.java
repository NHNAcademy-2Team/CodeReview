package com.nhnacademy;

import com.nhnacademy.Protos.Zealot;
import com.nhnacademy.Zerg.Zergling;

public class Game {

    public void board() {
        System.out.println("적군: Zerg");

    }

    public Game() {

    }
    public static void main(String[] args) {
        System.out.println("enemy: Zerg");
        System.out.print("0. ");
        Unit enemyUnit = new Zergling();
        System.out.println("Team: Protos");
        System.out.print("0. ");

        Unit teamUnit = new Zealot();

    }
}
