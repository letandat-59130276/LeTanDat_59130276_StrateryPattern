/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Con Meo Cutee
 */
public class Context {
     private Tinh tinhtoan;

    public void setTinhtoan(Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }

    public float tinh(float a, float b){
        return tinhtoan.tinh(a, b);
    }
}
