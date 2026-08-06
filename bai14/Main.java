package bai14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QuanLyCBGV ql = new QuanLyCBGV();

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them can bo");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Xoa theo ma GV");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

            case 1:

                CBGV cb = new CBGV();
                cb.nhap();
                ql.them(cb);
                break;

            case 2:

                ql.hienThi();
                break;

            case 3:

                System.out.print("Nhap ma GV can xoa: ");
                String ma = sc.nextLine();

                ql.xoa(ma);
                break;

            case 0:

                System.out.println("Tam biet!");
                System.exit(0);

            default:

                System.out.println("Lua chon khong hop le.");
            }

        }

    }

}