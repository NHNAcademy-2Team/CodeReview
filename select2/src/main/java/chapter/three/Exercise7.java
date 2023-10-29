package Select2.src.main.java.chapter.three;

public class Exercise7 {
    public static void main(String[] args) {

        boolean[] used;
        int count;       // The number of people who have been checked.
        used = new boolean[365];  // Initially, all entries are false.

        count = 0;

        while (true) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has already been used, quit.
            // Otherwise, record the birthday as used.

            int birthday;  // The selected birthday.
            birthday = (int) (Math.random() * 365);
            count++;

            System.out.printf("Person %d has birthday number %d%n", count, birthday);

            if (used[birthday]) {
                // This day was found before; It's a duplicate.  We are done.
                break;
            }

            used[birthday] = true;

        } // end while

        System.out.println();
        System.out.println("A duplicate birthday was found after "
                + count + " tries.");
    }

}
