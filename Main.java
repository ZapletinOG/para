import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Создаём объект Scanner для чтения ввода от пользователя
        Scanner in = new Scanner(System.in);
        // Просим пользователя ввести число
        System.out.print("Введите число: ");
        // Считываем и сохраняем введённое число
        int n = in.nextInt();
        // С помощью цикла генерируем и выводим таблицу умножения для введённого числа
        for (int i = 1; i <= 10; i++) {
            // Вычисляем и выводим результат умножения n на i
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}
