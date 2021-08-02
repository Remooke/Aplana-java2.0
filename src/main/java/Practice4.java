import java.util.Random;


public class Practice4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];
        int max = 10;
        int min = -10;
        int massMinPositive=0;
        int massMaxNegative=-11;
        //Поиск Максимального отрицательного и Минимального положительного
        for (int i =0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * ((max - min) + 1)) + min;
            if (mas[i] <0 && mas[i] > massMaxNegative){
                massMaxNegative = mas[i];
            }
            else if (mas[i] >=0 && mas[i] < massMinPositive){
                massMinPositive = mas[i];
            }
            System.out.print(mas[i]+ " ");
        }
        System.out.println();
        System.out.println("Максимальное отрицательное = " + massMaxNegative);
        System.out.println("Минимальное полодительное = " + massMinPositive);
        System.out.println("Замена элементов в массиве. Максимальное отрицательное заменяется минимальным положительным");
        for (int i =0; i < mas.length; i++){
            if (mas[i]==massMaxNegative){
                mas[i] = massMinPositive;
            }
            else if (mas[i]==massMinPositive){
                mas[i]=massMaxNegative;
            }
            System.out.print(mas[i]+ " ");
        }
    }
}
