package unit.eleven;

import java.io.PrintStream;

// 좀 더 줄일 수 있을 것 같은데.. 생각해보기!

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni11/node23.html
 * Exercise 11.2 Provide a recursive implementation of the operations of Exercise 11.1.
 */
public class Exercise2 {
    public static void main(String[] args) {
        testListNode();
    }

    public static void testListNode() {
        ListNode testListNode = create3NodesABC();
        ListNode testListNode1 = create3NodesABC();
        ListNode testListNode2 = create3NodesABC();
        System.out.println(length(testListNode, 0));
        print(insertAfter(testListNode, testListNode, "D", "C"), System.out);
        print(modify(testListNode, testListNode, "B", "A"), System.out);
        print(modifyAll(testListNode, testListNode, "A", "B"), System.out);
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

    public static int length(ListNode lis, int count) {
        if (lis == null) {
            return count;
        }
        count += 1;
        return length(lis.next, count);
    }

    public static ListNode insertAfter(ListNode lis, ListNode nextLis, String s, String given) {
        if (nextLis == null) {
            return lis;
        }
        if (nextLis.info.equals(given)) {
            ListNode emptyNode = nextLis.next;
            nextLis.next = new ListNode();
            nextLis.next.info = s;
            nextLis.next.next = emptyNode;
            return lis;
        }
        return insertAfter(lis, nextLis.next, s, given);
    }

    public static ListNode modify(ListNode lis, ListNode nextLis, String old, String ne) {
        if (nextLis == null) {
            return lis;
        }
        if (nextLis.info.equals(old)) {
            nextLis.info = ne;
            return lis;
        }
        return modify(lis, nextLis.next, old, ne);
    }

    public static ListNode modifyAll(ListNode lis, ListNode nextLis, String old, String ne) {
        if (nextLis == null)
            return lis;
        if (nextLis.info.equals(old))
            nextLis.info = ne;
        return modifyAll(lis, nextLis.next, old, ne);
    }

// 여기서부터 구현 못했습니다...
// 나중에 해서 꼭 올려보도록 하겠습니다..
//    public static ListNode insertBefore(ListNode lis, ListNode currentNode, String s, String given) {
//        if (currentNode.info.equals(given)) {
//            ListNode empty = currentNode;
//            ListNode insertNode = new ListNode();
//            insertNode.info = s;
//            insertNode.next = empty;
//            currentNode = insertNode;
//            return currentNode;
//        }
//        return insertBefore(lis, currentNode.next, s, given);
//    }
//
//    public static ListNode copy(ListNode lis) {
//        if (lis == null) {
//            return null;
//        }
//        ListNode newLis = new ListNode();
//        ListNode finalLis = newLis;
//        while (lis != null) {
//            newLis.info = lis.info;
//            newLis.next = lis.next == null ? null : new ListNode();
//            lis = lis.next;
//            newLis = newLis.next;
//        }
//        return finalLis;
//    }
//
//    public static ListNode invert(ListNode lis, ListNode newLis) {
//        if (lis == null) {
//            return null;
//        }
//        ListNode prevNode = null;
//        ListNode nextNode;
//        while (lis != null) {
//            nextNode = lis.next;
//            lis.next = prevNode;
//            prevNode = lis;
//            lis = nextNode;
//        }
//        lis = prevNode;
//        return lis;
//    }
//
//    public static ListNode deleteDoubles(ListNode lis) {
//        if (lis == null) {
//            return null;
//        }
//        lis.next = null;
//        return lis;
//    }
//
//    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
//        ListNode copyLis2 = copy(lis2);
//        while (lis1 != null) {
//            if (lis1.info.equals(lis2.info)) {
//                lis2 = lis2.next;
//            } else {
//                lis2 = copyLis2;
//            }
//            if (lis2 == null) {
//                return true;
//            }
//            lis1 = lis1.next;
//        }
//        return false;
//    }
}
