public abstract class Phone<D> implements Callable<String>, Informable<D> {
    private D number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(D number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(D number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callersName) throws NameException {
        if (callersName.length() < 4)
            throw new NameException("ОШИБКА!\nДлина имени должна быть минимум 4 знака.", callersName);
        System.out.println("Call from " + callersName);
    }

    public D getNumber() {
        return number;
    }

    void setNumber(D number) {
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