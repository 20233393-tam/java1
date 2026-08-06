package java1;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if ((a == b && a * a + b * b == c * c)
                    || (a == c && a * a + c * c == b * b)
                    || (b == c && b * b + c * c == a * a)) {
                System.out.println("Day la tam giac vuong can.");
            } else if (a * a == b * b + c * c
                    || b * b == a * a + c * c
                    || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }

        } else {
            System.out.println("Ba canh khong tao thanh tam giac.");
        }

        sc.close();
    }
}