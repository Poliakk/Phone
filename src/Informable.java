public interface Informable {
    default void info() {
        System.out.println("Incompatible information!");
    }
}