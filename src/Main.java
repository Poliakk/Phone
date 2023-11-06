/* DZ9_lesson10
Добавить в проект Phone свой класс NameException,
исправим метод receiveCall получаем имя от пользователя
и получаем исключение, если длина имени меньше 4 символов. \
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Phone<Long> tel1 = new SamsungPhone(89505554433L, "S23", 168);
        XiaomiPhone tel2 = new XiaomiPhone("+7(900)111-11-11", "11T", 204);
        Phone<String> tel3 = new ApplePhone("+7(950)333-11-77", "12", 162);
        Phone[] tel = {tel1, tel2, tel3};

        for (Phone i : tel) {
            String name = scanner.nextLine();
            try {
                i.receiveCall(name);
                i.info();
            } catch (NameException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
        scanner.close();
    }
}