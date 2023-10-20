package unit.eleven;

public class ListNode {

    private String info;    //데이터 저장 변수
    private ListNode link;  //다른 노드를 참조할 링크 노드

    public ListNode() {
        info = null;
        link = null;
    }

    public ListNode(String info) {
        this.info = info;
        this.link = null;
    }

    public ListNode(String info, ListNode link) {
        this.info = info;
        this.link = link;
    }

    public String getInfo() {
        return this.info;
    }

}
