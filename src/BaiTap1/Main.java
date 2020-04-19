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
        ITinh cong = new Cong();
        ITinh tru = new Tru();
        
        Context context = new Context();
        
        context.setTinhtoan(cong);
        System.out.println("75+12= " + context.tinh(75, 12));
    
        context.setTinhtoan(tru);
        System.out.println("54-78= " + context.tinh(54, 78));
    }
}
