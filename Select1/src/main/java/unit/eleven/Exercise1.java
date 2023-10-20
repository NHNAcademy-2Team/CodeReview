package unit.eleven;

import java.io.PrintStream;
import java.util.Objects;

public class Exercise1 {
    public static void main(String[] args) {
        testListNode();
    }

    public static void testListNode(){
        ListNode testListNode = create3NodesABC();
        ListNode testListNode1 = create3NodesABC();
        ListNode testListNode2 = create3NodesABC();
        System.out.println(length(testListNode));
        print(insertAfter(testListNode, "D", "C"), System.out);
        print(modify(testListNode, "B", "A"), System.out);
        print(modifyAll(testListNode, "A", "B"), System.out);
        print(insertBefore(testListNode, "A", "B"), System.out);
        print(copy(testListNode), System.out);
        print(invert(testListNode), System.out);
        print(deleteDoubles(testListNode), System.out);
        System.out.println(searchSequence(testListNode, testListNode2));
        System.out.println(searchSequence(testListNode1, testListNode2));
        System.out.println(searchSequence(testListNode2, testListNode1));
    }
    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = null;
        return a;
    }

    public static void print(ListNode lis, PrintStream ps) {
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    public static int length(ListNode lis) {
        int count = 0;
        while (lis != null) {
            lis = lis.next;
            count++;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode finalLis = lis;
        while (lis != null) {
            if (lis.info.equals(given)) {
                ListNode empty = lis.next;
                lis.next = new ListNode();
                lis.next.info = s;
                lis.next.next = empty;
            }
            lis = lis.next;
        }
        return finalLis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode finalLis = lis;
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
                break;
            }
            lis = lis.next;
        }
        return finalLis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode finalLis = lis;
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
            }
            lis = lis.next;
        }
        return finalLis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode finalLis = lis;
        ListNode newLis = new ListNode();
        newLis.info = s;
        if (lis.info.equals(given)) {
            newLis.next = lis;
            finalLis = newLis;
        } else {
            while (lis.next != null) {
                if (lis.next.info.equals(given)) {
                    ListNode empty = lis.next;
                    lis.next = newLis;
                    newLis.next = empty;
                    break;
                }
                lis = lis.next;
            }
        }
        return finalLis;
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return null;
        }
        ListNode newLis = new ListNode();
        ListNode finalLis = newLis;
        while (lis != null) {
            newLis.info = lis.info;
            newLis.next = lis.next == null ? null : new ListNode();
            lis = lis.next;
            newLis = newLis.next;
        }
        return finalLis;
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null) {
            return null;
        }
        ListNode prevNode = null;
        ListNode nextNode;
        while (lis != null) {
            nextNode = lis.next;
            lis.next = prevNode;
            prevNode = lis;
            lis = nextNode;
        }
        lis = prevNode;
        return lis;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null) {
            return null;
        }
        lis.next = null;
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode copyLis2 = copy(lis2);
        while (lis1 != null) {
            if (Objects.equals(lis1, lis2)) {
                lis2 = lis2.next;
            } else {
                lis2 = copyLis2;
            }
            if (lis2 == null) {
                return true;
            }
            lis1 = lis1.next;
        }
        return false;
    }
}
