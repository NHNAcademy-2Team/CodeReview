package unit.six;

public class Exercise15 {
    public static void main(String[] args) {
        Message m = new Message("ddong", "ddong2", "hello   my name    is  ddong ");
        System.out.println(m.getText());
        m.rebuildMessage();
        System.out.println(m.getText());
        m.deleteVowels();
        System.out.println(m.getText());

    }
}
