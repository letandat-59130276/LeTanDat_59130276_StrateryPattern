/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Con Meo Cutee
 */
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;
    
    public String getTenHH() {
        return tenHH;
    }

    public String getMota() {
        return moTa;
    }

    public int getGia() {
        return gia;
    }

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
}
