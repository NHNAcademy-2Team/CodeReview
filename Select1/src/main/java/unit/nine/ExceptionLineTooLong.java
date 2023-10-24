package unit.nine;

public class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The String is too long.");
    }

    public ExceptionLineTooLong(String message) {
        super(message);
    }
    public ExceptionLineTooLong(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionLineTooLong(Throwable cause) { super(cause); }
}
