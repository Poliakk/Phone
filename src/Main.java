/* DZ8_lesson9
 Изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
 применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */

public class Main {
    public static void main(String[] args) {
        SamsungPhone tel1 = new SamsungPhone(89505554433L, "S23", 168);
        tel1.receiveCall("Alex");
        tel1.info();

        XiaomiPhone tel2 = new XiaomiPhone("+7(900)111-11-11", "11T", 204);
        tel2.receiveCall("Nick");
        tel2.info();

        Phone<String> tel3 = new ApplePhone("+7(950)333-11-77", "12", 162);
        tel3.receiveCall("Kate");
        tel3.info();
    }
}