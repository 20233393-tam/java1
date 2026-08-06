package bai14;

import java.util.ArrayList;

public class QuanLyCBGV {

    ArrayList<CBGV> ds = new ArrayList<>();

    public void them(CBGV cb) {
        ds.add(cb);
    }

    public void hienThi() {

        if (ds.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }

        for (CBGV x : ds) {
            x.xuat();
            System.out.println("----------------------");
        }
    }

    public void xoa(String ma) {

        boolean tim = false;

        for (int i = 0; i < ds.size(); i++) {

            if (ds.get(i).getMaGV().equalsIgnoreCase(ma)) {
                ds.remove(i);
                tim = true;
                break;
            }
        }

        if (tim)
            System.out.println("Da xoa.");
        else
            System.out.println("Khong tim thay.");
    }
}