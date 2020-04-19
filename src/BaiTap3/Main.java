/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Con Meo Cutee
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        final SoSanhTheoDiem soSanhTheoDiem = new SoSanhTheoDiem();
        final SoSanhTheoTen soSanhTheoTen = new SoSanhTheoTen();

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Nguyen Nhat      Nam  ", df.parse(" 10/02/1999"), 10.0f);
        SinhVien sv2 = new SinhVien("Nguyen Nhat      Dang ", df.parse("19/04/1999"), 5.2f);
        SinhVien sv3 = new SinhVien("Tran Thi Thanh   Tam  ", df.parse(" 20/09/1999"), 7.3f);
        SinhVien sv4 = new SinhVien("Tran Thi Thanh   Nhan ", df.parse("22/02/1999"), 7.4f);

        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);

        QLSV QuanLy = new QLSV();
        QuanLy.setDs(sv);
        QuanLy.setiSoSanh(soSanhTheoTen);
        QuanLy.sapXep();
        System.out.println("\n -- Danh sach sinh vien sap xep theo ten -- ");
        QuanLy.inDS();

        QuanLy.setiSoSanh(soSanhTheoDiem);
        QuanLy.sapXep();
        System.out.println("\n -- Danh sach sinh vien sap xep theo diem -- ");
        QuanLy.inDS();
    }

}
