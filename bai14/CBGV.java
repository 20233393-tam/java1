package bai14;

import java.util.Scanner;

public class CBGV extends Nguoi {

    private double luongCung;
    private double thuong;
    private double phat;

    public CBGV() {

    }

    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);

        System.out.print("Luong cung: ");
        luongCung = Double.parseDouble(sc.nextLine());

        System.out.print("Thuong: ");
        thuong = Double.parseDouble(sc.nextLine());

        System.out.print("Phat: ");
        phat = Double.parseDouble(sc.nextLine());
    }

    public double tinhLuong() {
        return luongCung + thuong - phat;
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.println("Luong cung: " + luongCung);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phat: " + phat);
        System.out.println("Luong thuc linh: " + tinhLuong());
    }
}