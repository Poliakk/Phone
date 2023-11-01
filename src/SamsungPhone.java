public class SamsungPhone extends Phone {
    public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Phone number: %s\n model: samsung %s\t\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}