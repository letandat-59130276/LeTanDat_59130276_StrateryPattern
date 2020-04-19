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
public class Main {
    public static void main(String[] args){
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        
        Context context = new Context();
        
        context.setTinhToan(cong);
        System.out.println(context.Tinh(75, 12));
    
        context.setTinhToan(tru);
        System.out.println(context.tinh(54, 78));
    }
}
