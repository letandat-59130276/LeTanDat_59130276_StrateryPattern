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
public class GioHang {
    private IThanhToan hinhThucThanhToan;
    private ArrayList<HangHoa> hH;
    
    public void setHH(ArrayList<HangHoa> hH) {
        this.hH = hH;
    }

    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
    public double thanhToan(){
        int tong = 0;
        for(int i = 0; i < hH.size(); i++){
            tong += hH.get(i).getGia();
        }
        return hinhThucThanhToan.thanhToan(tong);
    }
}
