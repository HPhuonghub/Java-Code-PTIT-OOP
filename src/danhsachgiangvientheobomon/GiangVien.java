/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachgiangvientheobomon;

/**
 *
 * @author DELL
 */
public class GiangVien{
    private String ten,ma,mon,mon1;
    
    public GiangVien(int i, String ten, String mon){
        this.ma = "GV" + String.format("%02d", i);
        this.ten = ten;
        this.mon = mon;
    }

    public String getMon1() {
        solve();
        return mon1;
    }
    
    private void solve(){
        String[] s = mon.split(" ");
        String a = "";
        for(int i=0;i<s.length;i++){
            a += s[i].charAt(0);
        }
        mon1 = a.toUpperCase();
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + mon1;
    }
}
