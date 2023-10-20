package unit.eleven;

public class ListNode {

    private String information;
    public ListNode next;

    public ListNode(String information) {
        this.information = information;
        this.next = null;
    }

    public void setInfo(String information) {
        this.information = information;
    }

    public String getInfo() {
        return information;
    }
}
