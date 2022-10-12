/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangdiemhocsinh;
import java.math.*;
/**
 *
 * @author DELL
 */
class HocSinh implements Comparable<HocSinh>{
    private String ten,ma,xet,diem;
    private double tong;
    
    public HocSinh(int n, String ten, String diem){
        this.ma = "HS" + String.format("%02d", n);
        this.ten = ten;
        this.diem = diem;
    }
    
    private void solve(){
        tong = 0;
        String[] s = diem.split("\\s+");
        for(int i=0;i<s.length;i++){
            if(i==0||i==1) tong += Double.parseDouble(s[i])*2;
            else{
                tong += Double.parseDouble(s[i]);
            }
        }
        tong /= 12;
        tong = Math.round(tong * 10.0) / 10.0;
        if(tong<5) xet = "YEU";
        else if(tong<7) xet = "TB";
        else if(tong<8) xet = "KHA";
        else if(tong<9) xet = "GIOI";
        else xet = "XUAT SAC";
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + String.format("%.1f", tong) + " " + xet;
    }
    
    @Override
    public int compareTo(HocSinh a){
        solve();
        a.solve();
        if(tong == a.tong){
            if(ma.compareTo(a.ma)>0) return 1;
            if(ma.compareTo(a.ma)<0) return -1;
            return 0;
        }
        else if(tong > a.tong) return -1;
        else return 1;
    }
}
