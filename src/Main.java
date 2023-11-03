/* DZ7_lesson8
 создать в проекте с Phone интерфейсы: Callable с методом receiveCall()
 и Informable c default методом info() с default реализацией,
 применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */

public class Main {
    public static void main(String[] args) {
        Phone tel1 = new SamsungPhone("+7(910)555-44-33", "S23", 168);
        tel1.receiveCall("Alex");
        tel1.info();

        Phone tel2 = new XiaomiPhone("+7(900)111-11-11", "11T", 204);
        tel2.receiveCall("Nick");
        tel2.info();

        Phone tel3 = new ApplePhone("+7(950)333-11-77", "12", 162);
        tel3.receiveCall("Kate");
        tel3.info();
    }
}