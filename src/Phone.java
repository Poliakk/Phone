public class Phone {
    protected String number, model;
    protected int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String callersName) {
        System.out.println("\nCall from " + callersName);
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void info() {
        System.out.printf("Phone number: %s\nmodel: %s\tweight: %dг\n", getNumber(), getModel(), getWeight());
    }
}