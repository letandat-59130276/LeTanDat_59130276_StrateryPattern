/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;
/**
 *
 * @author Con Meo Cutee
 */
public class Main {
    private static void inDanhSach(ArrayList<HangHoa> danhsach,IThanhToan iThanhToan){
        GioHang gh =new GioHang();
        gh.setHinhThucThanhToan(iThanhToan);
        gh.setHH(danhsach);
        int tong = 0;
        System.out.println("--- Dach sach hang co trong gio ---");
        for (int i=0;i<danhsach.size();i++) {
            System.out.println("Ten hang: "+danhsach.get(i).getTenHH()+" -- gia: "+danhsach.get(i).getGia()+" -- mo ta: "+danhsach.get(i).getMota());
            tong = tong + danhsach.get(i).getGia();
        }
        
        System.out.println("Tong tien hang: "+tong);
        System.out.println("So tien khach phai tra: " + gh.thanhToan());
        System.out.println();
    }
    public static void main(String[] args) {
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa hH1 = new HangHoa("Quan Dai Nam ", 1100000, " Nhieu size tu 26 den 34");
        HangHoa hH2 = new HangHoa("Quan Jean Nam", 1300000, " Co vet rach va khong co vet rach");
        HangHoa hH3 = new HangHoa("Quan Tay Nu  ", 2200000, " Nhieu mau");
        HangHoa hH4 = new HangHoa("Quan Dui Nam ", 1800000, " Thich hop di choi, da ngoai, tam bien");
        HangHoa hH5 = new HangHoa("Quan Dai Nu  ", 5000000, " Danh cho dan cong so");

        ArrayList<HangHoa> danhsach1 = new ArrayList<>();
        danhsach1.add(hH2);
        danhsach1.add(hH4);
        danhsach1.add(hH5);
        inDanhSach(danhsach1,thanhToanOnline);
        
        ArrayList<HangHoa> danhsach2 = new ArrayList<>();
        danhsach2.add(hH1);
        danhsach2.add(hH3);
        danhsach2.add(hH5);
        inDanhSach(danhsach2,thanhToanCOD);
    }
}

