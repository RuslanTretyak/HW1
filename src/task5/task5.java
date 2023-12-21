package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите число q");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        System.out.println("Введите число w");
        int w = scanner.nextInt();
        System.out.println("В результате: " + q + " / " + w + " = " + (q / w) + " и " + (q % w) + " в остатке");
    }
}
