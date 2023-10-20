package com.nhnacademy.Protos;
import com.nhnacademy.Unit;

public class Zealot extends Unit {
    public Zealot() {
        super(false, false, 5, 20);
        System.out.println(toString());
    }

    public String toString() {
        return "Zealot (현재 방어력: " + getDefense() + ")";
    }
}
