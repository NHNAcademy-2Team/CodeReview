package com.nhnacademy.Zerg;
import com.nhnacademy.Unit;

public class Zergling extends Unit{
    private int offense;
    private int defense;

    public Zergling() {
        super(false, false, 2, 2);
        System.out.println(toString());

    }

    public String toString() {
        return "Zergling (현재 방어력: " + getDefense() + ")";
    }
}
