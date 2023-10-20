package unit.eleven;

import java.util.Objects;

public class Exercise1 {

    public static int length(ListNode listNode) {
        ListNode head = listNode;
        int count = 0;

        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    };

    public static ListNode insertBefore(ListNode listNode, String newInfo, String targetInfo) {
        ListNode head = listNode;

        if (Objects.isNull(equalsInfo(head, targetInfo))) {
            throw new IllegalArgumentException("해당 값이 존재하지 않습니다.");

        } else if (head.getInfo().equals(targetInfo)) {
            ListNode insertNode = new ListNode(newInfo);
            insertNode.next = head;
            listNode = insertNode;

        } else {
            while (!head.next.getInfo().equals(targetInfo)) {
                head = head.next;
            }
            ListNode insertNode = new ListNode(newInfo);
            insertNode.next = head.next;
            head.next = insertNode;
        }
        return listNode;
    }

    public static ListNode insertAfter(ListNode listNode, String newInfo, String targetInfo) {
        ListNode head = listNode;

        ListNode foundNode = equalsInfo(head, targetInfo);
        if (Objects.isNull(foundNode)) {
            throw new IllegalArgumentException("해당 값이 존재하지 않습니다.");
        } else {
            ListNode insertNode = foundNode.next;
            foundNode.next = new ListNode(newInfo);
            foundNode.next.next = insertNode;
        }
        return listNode;
    }

    public static ListNode equalsInfo(ListNode head, String targetInfo) {
        while (head.getInfo() != targetInfo && head.next != null) {
            head = head.next;
        }
        return (head.getInfo().equals(targetInfo)) ? head : null;
    }

    public static ListNode modify(ListNode listNode, String originalInfo, String replacementInfo) {
        ListNode head = listNode;

        ListNode foundNode = equalsInfo(head, originalInfo);
        if (Objects.isNull(foundNode)) {
            return null;
        } else {
            foundNode.setInfo(replacementInfo);
            return listNode;
        }
    }

    public static ListNode modifyAll(ListNode listNode, String originalInfo, String replacementInfo) {
        ListNode head = listNode;

        while (!Objects.isNull(modify(head, originalInfo, replacementInfo))) {
        }
        return listNode;
    }

    public static ListNode copy(ListNode listNode) {
        ListNode copyListNode = new ListNode(listNode.getInfo());

        ListNode lisHead = listNode;
        ListNode copyHead = copyListNode;

        if (Objects.isNull(lisHead)) {
            throw new IllegalArgumentException("복사할 값이 존재하지 않습니다.");
        } else {
            while (lisHead.next != null) {
                lisHead = lisHead.next;
                ListNode copyNode = new ListNode(lisHead.getInfo());
                copyHead.next = copyNode;
                copyHead = copyHead.next;
            }
        }
        return copyListNode;
    }

    public static ListNode invert(ListNode listNode) {
        ListNode head = null;

        while (listNode != null) {
            ListNode temp = listNode;
            listNode = listNode.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }

    // public static ListNode deleteDoubles(ListNode listNode) {

    // }

    // public static boolean searchSequence(ListNode lis1, ListNode lis2) {

    // }
}
