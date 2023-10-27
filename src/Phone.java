public class Phone {
    private String number, model;
    private int weight;

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
        System.out.println("\nCall from " + callersName + "\n" + getNumber());
    }
    public String getNumber() {
        return number;
    }
    protected void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    protected void setModel(String model) {//предупр-е, т.к. setModel не public
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    protected void setWeight(int weight) {
        this.weight = weight;
    }
    public void info() {
        System.out.printf("Phone number: %s\nmodel: %s\tweight: %dг\n", getNumber(), getModel(), getWeight());
    }
}