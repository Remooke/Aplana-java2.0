import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую функцию: 1 = Калькулятор, 2 = Работа с массивом");
        int choise = scanner.nextInt();
        if (choise == 1) {
            calculate(); // вызов калькулятора
        }
        else if (choise ==2){
            maxM();
        }
        else {
            System.err.println("ERROR");
        }
    }
    //метод калькулятор дробных чисел
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        Double num1;
        Double num2;
        int d;
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();
        System.out.println("Выберите Пункт необходимой операции (1 = сложение, 2 = вычитание, 3 = деление, 4 = умножение)");
        d = scanner.nextInt();
        double result;
        switch (d){
            case 1:
                result = num1 + num2;
                System.out.printf("Сумма = %.4f", result );
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("Разность = %.4f", result );
                break;
            case 3:
                result = num1 / num2;
                System.out.printf("Частное = %.4f", result );
                break;
            case 4:
                result = num1 * num2;
                System.out.printf("Произведение = %.4f", result );
                break;
            default:
                System.err.println("ERROR. Выберите один из 4 пунктов");
        }
    }
    //поиск длинейшего слова
    public static void maxM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        String[] mas = new String[n];
        int maxElement = 0;
        String maxslovo = null;
        for (int i =0; i < mas.length; i++){
            System.out.println("Введите " + (i+1) + " слово");
            mas[i] = scanner.next();
            if (maxElement < mas[i].length()) {
                maxElement = mas[i].length();
                maxslovo = mas[i];
            }
        }
        System.out.println("Максимальный элемент: " + maxslovo);
        System.out.println("Количество символов в слове: " + maxElement);
    }
}
