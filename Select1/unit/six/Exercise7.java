package Select1.unit.six;

public class Exercise7 {
    public static int subsequence(String s) {
        char bit;
        int cont = 0;
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {
            bit = s.charAt(i);

            if (bit == '0') {
                cont++;
                if (cont > maxlen)
                    maxlen = cont;
            } else
                cont = 0;
        }

        return maxlen;
    }

    public static void main(String[] args) {

    }
}
