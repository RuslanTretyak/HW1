package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number / 10 + number % 10;
        System.out.println("сумма цифр числа " + number + " равна " +  sum);

    }
}
