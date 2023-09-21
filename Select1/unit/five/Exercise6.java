package unit.five;

public class Exercise6 {
    public String massge;

    public Exercise6() {
    }

    public Exercise6(String s) {
        this.massge = s;
    }

    public void question() {
        if (massge.equals("vocal")) {
            System.out.println("MAYBE");
        }
        if (massge.charAt(massge.length() - 1) == 'a' || massge.charAt(massge.length() - 1) == 'i'
                || massge.charAt(massge.length() - 1) == 'u') {
            System.out.println("YES");
        } else if (massge.charAt(massge.length() - 1) == 'e' || massge.charAt(massge.length() - 1) == 'o') {
            System.out.println("NO");
        } else {
            System.out.println("DON'T KNOW");
        }

    }

}
