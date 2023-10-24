package unit.eleven;

class ListNode {
    public String info;
    public ListNode next;

    public ListNode() {
        this(null, null);
    }

    public ListNode(String info) {
        this(info, null);
    }

    public ListNode(String info, ListNode next) {
        this.info = info;
        this.next = next;
    }
}