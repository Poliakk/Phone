public class SamsungPhone extends Phone {
    public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\nmodel: samsung %s\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}