package bai14;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maGV;

    public Nguoi() {

    }

    public Nguoi(String hoTen, int tuoi, String queQuan, String maGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maGV = maGV;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Que quan: ");
        queQuan = sc.nextLine();

        System.out.print("Ma giao vien: ");
        maGV = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Ma GV: " + maGV);
    }

    public String getMaGV() {
        return maGV;
    }
}