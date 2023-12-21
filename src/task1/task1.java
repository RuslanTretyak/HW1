package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число b");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        int a = 4 * (b + c - 1) / 2;
        System.out.println("a = " + a);
    }
}
