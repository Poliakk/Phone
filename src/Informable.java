public interface Informable {
    default void info() {
        System.out.println("Ahoy!");
    }
}