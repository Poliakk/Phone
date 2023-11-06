public class NameException extends Throwable {
    String mes, name;
    public NameException (String message, String name) {
        super(message);
        this.name = name;
    }
}
