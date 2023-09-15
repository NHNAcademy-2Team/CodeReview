package Message;

import java.util.Scanner;

public class MessageText {
    String message;
    String code;

    public MessageText(Scanner s) {
        this.code = s.nextLine();
        this.message = s.nextLine();
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
