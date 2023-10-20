package unit.three.Message;

import javax.swing.JOptionPane;

public class MessageText {
    private String message;
    private String code;

    public MessageText() {
        this.code = JOptionPane.showInputDialog("Please enter code");
        this.message = JOptionPane.showInputDialog("Please enter message about code");
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
