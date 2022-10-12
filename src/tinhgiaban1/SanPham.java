/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgiaban1;
import java.math.*;
/**
 *
 * @author DELL
 */
public class SanPham {
    private String ma,ten,donvitinh;
    private float dongianhap,soluong,phivanchuyen,thanhtien,giaban;

    public SanPham(int n, String ten, String donvitinh, float dongianhap, float soluong) {
        this.ma = "MH" + String.format("%02d", n);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.dongianhap = dongianhap;
        this.soluong = soluong;
    }
    
    private void solve(){
        phivanchuyen = (dongianhap * soluong)*5/100;
        thanhtien = dongianhap*soluong+phivanchuyen;
        giaban = thanhtien + thanhtien*2/100;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + donvitinh + " " + String.format("%.0f", phivanchuyen) + " " + String.format("%.0f", thanhtien) + " " + String.format("%.0f", giaban);
    }
}
