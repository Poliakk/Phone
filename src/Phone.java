public abstract class Phone implements Callable, Informable {
    private String number;
    private String model;
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
        System.out.println("\nCall from " + callersName);
    }

    public String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void info();
}