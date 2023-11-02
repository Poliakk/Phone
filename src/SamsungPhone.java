public class SamsungPhone extends Phone implements Callable, Informable {
    public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\n model: samsung %s\t\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}