// Exercise 03.3

public class MessageText {
    private String message;
    private String code;

    public MessageText(String message) {
        this.message = message;

        initialsOfMessage(message);
    }

    private void initialsOfMessage(String message) {
        String initials = "";
        String[] arrays = message.split(" ");

        for (int i = 0; i < arrays.length; i++) {
            if (i > 2) {
                break;
            } else {
                initials += arrays[i].substring(0, 1);
            }
        }
        this.code = initials.toLowerCase();
    }

    public String codeToMessage(String code) {
        return this.message;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCode() {
        return this.code;
    }
}
