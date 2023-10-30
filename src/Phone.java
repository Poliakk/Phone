public class Phone {
    private static int counter;
    private String number, model;
    private int weight;
    private int id;

    {
        counter++;
        id = getCounter();
    }

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

    protected static int getCounter() {
        return counter;
    }

    public void receiveCall(String callersName) {
        System.out.println("\nCall from " + callersName + "\n" + getNumber());
    }

    protected String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {//предупр-е, т.к. setModel не public
        this.model = model;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    void info() {
        System.out.printf("ID: %d\tPhone number: %s\nmodel: %s\tweight: %dг\n", id, this.getNumber(), this.getModel(), this.getWeight());
    }
}