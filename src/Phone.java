public class Phone {
    private String number;
    String model;    //package-private
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
    /*длинно
    public void receiveCall_0(String callersName) {
        System.out.println("\nCall from " + callersName +"\n");
    }
    public void receiveCall_1(String callersName) {
        System.out.println("\nCall from " + callersName + "\n" + number);  //работает с private
    }
    */
    public void receiveCall(String callersName) {
        System.out.println("\nCall from " + callersName + "\n" + getNumber());
    }
    public void receiveCall(String callersName, String num) {
        System.out.println("\nCall from " + callersName + "\n" + num);
    }

    public String getNumber() {
        return number;
    }
    void setNumber(String number) { //предупр-е, т.к. setNumber не public
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    void setModel(String model) {//предупр-е, т.к. setModel не public
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    void setWeight(int weight) {
        this.weight = weight;
    }
    /*работает с private number
    public void info_0() {
        System.out.printf("Phone number: %s\nmodel: %s\tweight: %dг\n", number, getModel(), getWeight());
    }
     */
    public void info() {
        System.out.printf("Phone number: %s\nmodel: %s\tweight: %dг\n", getNumber(), getModel(), getWeight());
    }
}