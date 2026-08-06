package java1;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;

        if (n % 2 != 0) {
            n--; // Nếu n lẻ thì lấy số chẵn nhỏ hơn gần nhất
        }

        for (int i = 2; i <= n; i += 2) {
            tong += i;
        }

        System.out.println("Tong cac so chan = " + tong);

        sc.close();
    }
}