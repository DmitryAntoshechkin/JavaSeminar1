// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

package seminar1_Homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            Scanner myScanner= new Scanner(System.in, "Cp866");
            System.out.printf("Введите число: ");
            int number = myScanner.nextInt();
            myScanner.close();  
            if (number < 1){
                System.out.println("Число не может быть меньше 1");
            }
            else{
                int sum = 0;
                int factorial = 1;
                for (int i = 1; i <= number; i++){
                    sum += i;
                    factorial *= i;
                }
                System.out.printf("Сумма числел = %d\n", sum);
                System.out.printf("Факториал числа = %d\n", factorial);
            }
        }   
    catch (Exception ex){
        System.out.println("Введены некорректные данные");
    }
}
}
    