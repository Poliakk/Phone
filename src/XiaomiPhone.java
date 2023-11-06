public class XiaomiPhone extends Phone<String> {
    public XiaomiPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\nmodel: xiaomi %s\tweight: %dг\n\n",
                this.getNumber(), this.getModel(), this.getWeight());
    }
}