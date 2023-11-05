public class ApplePhone extends Phone<String> {
    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\nmodel: iPhone %s\tweight: %dг\n",
                this.getNumber(), this.getModel(), this.getWeight());
    }
}