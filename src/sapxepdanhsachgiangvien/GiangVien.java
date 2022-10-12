/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachgiangvien;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class GiangVien implements Comparable<GiangVien>{
    private String ten,ma,mon,mon1,tens;
    
    public GiangVien(int i, String ten, String mon){
        this.ma = "GV" + String.format("%02d", i);
        this.ten = ten;
        this.mon = mon;
    }
    
    private void solve(){
        String[] s = mon.split(" ");
        String a = "";
        for(int i=0;i<s.length;i++){
            a += s[i].charAt(0);
        }
        mon1 = a.toUpperCase();
        String[] s1 = ten.split(" ");
        String b = s1[s1.length-1];
        tens = b;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + mon1;
    }
    
    @Override
    public int compareTo(GiangVien a){
        solve();
        a.solve();
        if(tens.compareTo(a.tens)>0) return 1;
        if(tens.compareTo(a.tens)<0) return -1;
        return 0;
    }
}
