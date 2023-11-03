public class XiaomiPhone extends Phone implements Callable, Informable {
    public XiaomiPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\nmodel: xiaomi %s\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}