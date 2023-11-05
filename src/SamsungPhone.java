public class SamsungPhone extends Phone<Long> {
    public SamsungPhone(Long number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        String n1, n2, n3, n4;
        String nn = Long.toString(this.getNumber());
        if (nn.startsWith("8")) {
            n1 = nn.substring(1, 4);
            n2 = nn.substring(4, 7);
            n3 = nn.substring(7, 9);
            n4 = nn.substring(9, 11);
            nn = "+7(" + n1 + ")" + n2 + "-" + n3 + "-" + n4;
        }
        System.out.printf("Phone number: %s\nmodel: samsung %s\tweight: %dг\n",
                nn, this.getModel(), this.getWeight());
    }
}