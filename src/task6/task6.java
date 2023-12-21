package task6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите переменную a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите переменную b");
        int b = scanner.nextInt();

        a += b;
        b = a - b;
        a -= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
