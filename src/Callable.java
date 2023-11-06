public interface Callable<T> {
    void receiveCall(T callersName) throws NameException;
}