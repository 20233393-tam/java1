package java1;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }

        System.out.println("Tong nghich dao = " + tong);

        sc.close();
    }
}