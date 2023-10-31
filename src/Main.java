/* DZ6_lesson7
Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
Реализацию info() в каждом классе-наследнике.
Создать объекты каждого класса-наследника и проверить метод Info().
 */

public class Main {
    public static void main(String[] args) {
        Phone tel1 = new SamsungPhone("+7(910)555-44-33", "S23", 168);
        tel1.info();

        Phone tel2 = new XiaomiPhone("+7(900)111-11-11", "11T", 204);
        tel2.info();

        Phone tel3 = new ApplePhone("+7(950)333-11-77", "12", 162);
        tel3.info();

        tel1.receiveCall("Alex");
        tel2.receiveCall("Nick");
        tel3.receiveCall("Kate");
    }
}