public class ApplePhone extends Phone {
    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\nmodel: IPhone %s\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}