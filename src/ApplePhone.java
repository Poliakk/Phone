public class ApplePhone extends Phone implements Callable, Informable {
    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\n model: IPhone %s\t\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}