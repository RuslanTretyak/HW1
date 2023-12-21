package task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите число с дробной частью");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        System.out.println("Результат округления введенного числа до ближайшего целого: " + (int) (number + 0.5));
    }
}
