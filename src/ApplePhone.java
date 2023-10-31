public class ApplePhone extends Phone {
    private String hello = "Hello!";

    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public String getHello() {
        return hello;
    }

    void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public void receiveCall(String callersName) {
        System.out.println("\n" + hello + "\nCall from " + callersName + "\n" + getNumber());
    }
    public void info() {
        System.out.printf("Phone number: %s\n model: IPhone %s\tweight: %dг\n",
                getNumber(), getModel(), getWeight());
    }
}