/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgiaban2;
import java.math.*;
/**
 *
 * @author DELL
 */
class SanPham implements Comparable<SanPham>{
    private String ma,ten,donvitinh;
    private double dongianhap,soluong,phivanchuyen,thanhtien,giaban;

    public SanPham(int n, String ten, String donvitinh, double dongianhap, double soluong) {
        this.ma = "MH" + String.format("%02d", n);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.dongianhap = dongianhap;
        this.soluong = soluong;
    }
    
    private void solve(){
        phivanchuyen = (dongianhap * soluong)*5/100;
        thanhtien = dongianhap*soluong+phivanchuyen;
        giaban = (thanhtien + thanhtien*2/100)/soluong/100;
        giaban = Math.ceil(giaban)*100;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + donvitinh + " " + String.format("%.0f", phivanchuyen) + " " + String.format("%.0f", thanhtien) + " " +  String.format("%.0f", giaban);
    }
    
    @Override
    public int compareTo(SanPham a){
        solve();
        a.solve();
        if(giaban < a.giaban) return 1;
        if(giaban > a.giaban) return -1;
        return 0;
    }
}
