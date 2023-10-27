/* DZ5_lesson6
Класс Phone. Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных. Добавить в класс Phone методы:
 receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
 */

public class Main {
    public static void main(String[] args) {
        Phone tel1 = new Phone();
        tel1.setNumber("+7(910)555-44-33");
        tel1.setModel("Honor");
        tel1.setWeight(320);
        tel1.info();

        Phone tel2 = new Phone("+7(900)111-11-11", "Taiga", 1500);
        tel2.info();

        Phone tel3 = new Phone("+7(950)333-11-77", "Nokia", 250);
        tel3.info();

        tel1.receiveCall("Alex");
        System.out.println(tel1.getNumber());
        tel2.receiveCall("Nick");
        System.out.println(tel2.getNumber());
        tel3.receiveCall("Kate");
        System.out.println(tel3.getNumber());
    }
}