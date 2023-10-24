package chater.two.exercise4;

import java.util.Objects;

public class Exercise4 {
    public static void main(String[] args) {
        changeTest();
    }

    private static Change createChange(int[] changeArr) {
        Objects.requireNonNull(changeArr);
        if (changeArr.length != 4) {
            throw new IllegalArgumentException("배열의 길이가 맞지 앖습니다.");
        }
        return new Change.Builder()
                .quarter(changeArr[0]).dime(changeArr[1])
                .nickel(changeArr[2]).penny(changeArr[3]).build();
    }

    public static void changeTest() {
        Change change = createChange(InputInformation.ChangeInformation());
        System.out.println(change.convertDollar() + "$");
    }
}
