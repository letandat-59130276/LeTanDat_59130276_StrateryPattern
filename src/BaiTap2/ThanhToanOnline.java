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
public class ThanhToanOnline {
     @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return 0.95*tienHang;
        else 
            return 0.93*tienHang;
    }    
}
