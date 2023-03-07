//Вывести все простые числа от 1 до 1000

package seminar1_Homework;
import java.util.Scanner;
public class task2 {
    
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
                boolean isSimple = true;
                for (int i = 1; i <= number; i++){
                    for(int j = 2; j < i; j++){
                        if (i % j == 0){
                            isSimple = false;
                        }                    
                    }
                    if (isSimple == true && i != 2){
                        System.out.printf("%d, ",i);
                    }
                    else{
                        isSimple = true;
                    }              
                } 
            }  
        }    
        catch (Exception ex){
            System.out.println("Введены некорректные данные");
        }
    }
}
