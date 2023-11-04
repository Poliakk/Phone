public interface Informable<D> {
    D getNumber();

    default void info() {
        System.out.println("Incompatible information!");
    }
}