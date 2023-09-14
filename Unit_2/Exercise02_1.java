/*
 * Exercise 02.1
 * Exercise 02.3
 */

public class Exercise02_1 {
    public static void main(String[] args) {

        // 02.1
        String name = new String("이태희");

        String mixName = new String();
        System.out.println(mixName.concat(name.substring(0, 1))
                + mixName.concat(name.substring(name.length() - 1, name.length())));
    }
}
