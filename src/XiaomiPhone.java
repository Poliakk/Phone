public class XiaomiPhone extends Phone {
    public XiaomiPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\n model: xiaomi %s\t\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}