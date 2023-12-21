package task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number / 100 + (number % 100) / 10 + number % 10;
        System.out.println("сумма цифр числа " + number + " равна " +  sum);
    }
}
