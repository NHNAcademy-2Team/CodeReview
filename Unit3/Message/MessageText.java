package Message;

import java.util.Scanner;

public class MessageText {
    String message;
    String code;

    public MessageText(Scanner s) {
        System.out.print("please enter code: ");
        this.code = s.nextLine();

        System.out.print("please enter message about code: ");
        this.message = s.nextLine();
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
