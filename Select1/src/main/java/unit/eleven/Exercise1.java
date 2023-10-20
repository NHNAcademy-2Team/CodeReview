package unit.eleven;

public class Exercise1 {

    public static int length(ListNode lis) {

        return lis.length;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {

        if (given != null) {
            lis.setInfo(given.concat(s));
        } else {
            return lis;
        }
    }

    public static ListNode modify(ListNode lis, String old, String ne) {

        for (int i = 0; i < lis.length(lis); i++) {
            if (lis.chartAt(i).equals(old)) {
                lis.chartAt(i) = ne;
            }
        }

    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {

    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {

    }

    public static ListNode copy(ListNode lis) {

    }

    public static ListNode invert(ListNode lis) {

    }

    public static ListNode deleteDoubles(ListNode lis) {

    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {

    }
}
