/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhthunhapchonhanvien;
import java.math.*;
/**
 *
 * @author DELL
 */
public class NhanVien {
    private String ten,cv,ma;
    private int lcb,nc;
    private double tu,pc,lc,cl;

    public NhanVien(int n, String ten, String cv, int lcb, int nc) {
        this.ma = "NV" + String.format("%02d", n);
        this.ten = ten;
        this.cv = cv;
        this.lcb = lcb;
        this.nc = nc;
    }
    
    private void solve(){
        //phu cap
        if(cv.equals("GD")) pc = 500;
        else if(cv.equals("PGD")) pc = 400;
        else if(cv.equals("TP")) pc = 300;
        else if(cv.equals("KT")) pc = 250;
        else pc = 100;
        // luong co ban
        lc = lcb * nc;
        // tam ung
        if((pc+lc)*2/3 < 25000){
            tu = (pc+lc)*2/3/1000;
            tu = Math.round(tu);
            tu = tu *1000;
        }
        else tu = 25000;
        // con lai
        cl = lc + pc - tu;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + String.format("%.0f", pc) + " " + String.format("%.0f", lc) + " " + String.format("%.0f", tu) + " " + String.format("%.0f", cl);
    }
}
