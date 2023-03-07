// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package seminar1_Homework;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task3 {
    public static void main(String[] args) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.#####");
            Scanner myScanner= new Scanner(System.in, "Cp866");
            System.out.printf("Введите первое число: ");
            double number1 = myScanner.nextDouble();
            System.out.printf("Введите действие: ");
            String action = myScanner.next();
            System.out.printf("Введите второе число: ");
            double number2 = myScanner.nextDouble();
            myScanner.close();             
            switch(action){
                case "+": 
                    System.out.println("Результат операции: " + decimalFormat.format(number1+number2));
                    break;
                case "-": 
                    System.out.println("Результат операции: " + decimalFormat.format(number1-number2));
                    break;
                case "*": 
                    System.out.println("Результат операции: " + decimalFormat.format(number1*number2));
                    break;
                case "/": 
                    System.out.println("Результат операции: " + decimalFormat.format(number1/number2));              
                     break;    
                default:
                    System.out.println("Введена некорректная операция");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Введены некорректные данные");
        }

    }
}
