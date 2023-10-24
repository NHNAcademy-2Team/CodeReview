package unit.eleven;


public class Exercise1 {
    private static int count;
    private static ListNode tmp;
    public static int length(ListNode lis) {
        // that returns the length of lis;
        if(lis != null && lis.next != null) {
            count++;
            return length(lis.next);
        }
        int result = ++count;
        count = 0;
        return result;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        /* that returns the list obtained by modifying lis by inserting a new element s after a given element,
         * if such an element is present, and returns lis unmodified otherwise; */

        if (lis != null) {
            if(!lis.info.equals(given)) {
                return insertAfter(lis.next, s, given);
            } else {
                lis.next = new ListNode(s, lis.next);
            }
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        // that returns the list obtained by modifying lis by changing the first occurrence of old to ne;

        if(lis != null) {
            if (!lis.info.equals(old)) {
                return modify(lis.next, old, ne);
            }
            lis.info = ne;
        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        // that returns the list obtained by modifying lis by changing all occurrences of old to ne;

        if(lis != null) {
            if(lis.info.equals(old)) {
                lis.info = ne;
            }
            return modifyAll(lis.next, old, ne);
        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        /* that returns the list obtained by modifying lis by inserting a new element s before a given element,
         * if such an element is present, and returns lis unmodified otherwise; */

        if(lis == null) {
            return lis;
        }

        // lis != null
        if(lis.info.equals(given)) {
            lis = new ListNode(s, lis);
            return lis;
        }

        lis.next = insertBefore(lis.next, s, given);
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        /* that returns a copy of the list lis, i.e., a list containing the same sequence of elements as lis,
         * but using new nodes; */
        // recursive로 못 만듦


//        if(lis == null) {
//            return lis;
//        }
//
//        if(tmp == null) {
//            tmp = new ListNode(lis.info);
//            return tmp;
//        }
//
//        // lis != null && tmp != null;
//
//        tmp.next = copy(lis.next);
//        ListNode result = tmp;
//
//        return tmp;

        ListNode head = lis;
        ListNode newLis = new ListNode(head.info);
        ListNode headForCopy = newLis;
        while(head.next != null) {
            headForCopy.next = new ListNode(head.next.info);
            head = head.next;
            headForCopy = headForCopy.next;
        }

        return newLis;

    }

    public static ListNode invert(ListNode lis) {
        // that modifies lis by inverting the links among its nodes, and returns a reference to the inverted list;
        // 다 못 풀었어유ㅠㅠ
        // recursive로 못 만듦

//        ListNode lis2 = new ListNode(lis.info, null);
//        ListNode head = lis;
//
//        while(head.next != null) {
//            insertBefore(lis2, head.next.info, head.info);
//        }
//
        return lis;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        // that returns the list obtained by modifying lis by deleting all occurrences of an element apart from the first one.
        lis.next = null;

        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        /* that checks whether the lis lis1 contains a subsequence of consecutive elements that coincides with lis2.
         * For example, if the sequence of elements of lis1 is (A B B C D E),
         * and the sequence of elements of lis2 is (B B C), the result should be true.
         * Instead, if lis1 is again (A B B C D E) and lis2 is (A B C), the result should be false. */
        // recursive 못 만듦
        ListNode head = lis1;
        ListNode finder = head;
        ListNode headSecond = lis2;

        for(int i =0; i < length(lis1) - length(lis2) + 1; i++) {
            int count = 0;
            for (int j = 0; j < length(lis2); j++) {
                if (!finder.info.equals(headSecond.info)) {
                    break;
                }
                count++;
                finder = finder.next;
                headSecond = headSecond.next;
            }
            if (count == length(lis2)) return true;

            head = head.next;
            finder = head;
            headSecond = lis2;
        }

        return false;
    }

    public static ListNode generate() {
        ListNode head;

        head = new ListNode("1",
                new ListNode("2",
                        new ListNode("2",
                                new ListNode("4",
                                        null))));

        return head;
    }

    public static void print(ListNode lis) {
        if(lis == null) {
            System.out.println();
        } else {
            System.out.print(lis.info + " -> ");
            print(lis.next);
        }
    }

    public static void main(String[] args) {
        ListNode lis = generate();
        System.out.println("Count: " + length(lis));


        insertAfter(lis, "hello", "2");
        System.out.println("ListNode: ");
        print(lis);

        modify(lis, "Hi", "2");
        print(lis);

        modifyAll(lis, "2", "Hi");
        print(lis);

        insertBefore(lis, "0", "1");
        insertBefore(lis, "3", "4");
        print(lis);

        ListNode lis2 = copy(lis);
        print(lis2);

        System.out.println();
        ListNode head;
        ListNode lis3 = invert(lis2);
        head = lis3;
        for(int i = 0; i < length(lis3); i++) {
            System.out.println(head.info + " -> ");
            head = head.next;
        }


        System.out.println();
        head = deleteDoubles(lis2);
        for(int i = 0; i < length(lis2); i++) {
            System.out.print(head.info + " -> ");
            head = head.next;
        }

        System.out.println();
        System.out.println(searchSequence(lis, lis2));
        head = lis2;
        for(int i = 0; i < length(lis2); i++) {
            System.out.print(head.info + " -> ");
            head = head.next;
        }
    }
}
