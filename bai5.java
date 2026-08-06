package java1;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        long a = 0;
        long b = 1;

        System.out.println("Day Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            long c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}