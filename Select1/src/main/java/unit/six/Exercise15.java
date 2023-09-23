package unit.six;

public class Exercise15 {
    public static void main(String[] args) {
        Message message = new Message("suyeon", "hi", " hhh   i ew  ew  eew");
        System.out.println(message.swappingSpace(message.getText()));
        System.out.println(message.swappingVowels(message.getText()));
        System.out.println(message.swapping(message.getText()));
    }
}
