/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdonhang;

/**
 *
 * @author DELL
 */
class DonHang implements Comparable<DonHang>{
    private String ten,ma,stt;
    private long gia,soluong,giamgia,thanhtien,kt;
    
    public DonHang(String ten, String ma, long gia,long soluong){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.soluong = soluong;
        this.stt = ma.substring(1, 4);
    }
    
    private void solve(){
        String s1 = "1", s2 = "2";
        if(ma.substring(4).equals(s2)){
            giamgia = 3*gia*soluong/10;
        }
        if(ma.substring(4).equals(s1)){
            giamgia = gia*soluong/2;
        }
        thanhtien = gia*soluong-giamgia;
    }
    
    private void solvestt(){
        kt = Long.parseLong(stt);
    }
    
    public String toString(){
        solve();
        return ten + " " + ma + " " + stt + " " + giamgia + " " + thanhtien;
    }
    
    public int compareTo(DonHang a){
        solvestt();
        a.solvestt();
        if(kt < a.kt) return -1;
        if(kt > a.kt) return 1;
        return 0;
    }
}
