// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package seminar1_Homework;

import java.util.Scanner;
import java.lang.Math;

public class task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите  первое слагаемое. Одну цифру замените знаком ?: ");
        String number1 = myScanner.next();
        System.out.println("Введите второе слагаемое. Одну цифру замените знаком ?: ");
        String number2 = myScanner.next();
        System.out.println("Введите сумму чисел: ");
        int sum = myScanner.nextInt();
        myScanner.close();

        int numbers1[] = GetNumbers(number1);
        int numbers2[] = GetNumbers(number2);

        boolean isSolved = false;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (numbers1[i] + numbers2[j] == sum) {
                    isSolved = true;
                    System.out.printf("%d + %d = %d", numbers1[i], numbers2[j], sum);
                    break;
                }
            }
        }
        if (isSolved == false) {
            System.out.println("Решение отсутствует ");
        }
    }

    public static int[] GetNumbers(String number) {
        int numbers[] = new int[10];
        int num = 0;
        int pos = -1;
        for (int j = number.length() - 1; j >= 0; j--) {
            if (Character.isDigit(number.charAt(j))) {
                num = num + (Character.digit(number.charAt(j), 10) * (int) Math.pow(10, number.length() - j - 1));
            } else {
                pos = number.length() - j - 1;
                num = num + (int) Math.pow(10, number.length() - j - 1);
            }
        }
        for (int i = 0; i <= 9; i++) {
            if (pos != -1) {
                numbers[i] = num - (int) Math.pow(10, pos) + i * (int) Math.pow(10, pos);
            } else {
                numbers[i] = num;
            }
        }
        return numbers;
    }
}
