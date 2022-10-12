/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachthuctap1;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{
    private String stt,ma,ten,lop,gmail,dn;

    public SinhVien(int n, String ma, String ten, String lop, String gmail, String dn) {
        this.stt = String.format("%01d", n) ;
        this.ma = ma.trim();
        this.ten = ten.trim();
        this.lop = lop.trim();
        this.gmail = gmail.trim();
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }
    
    @Override
    public String toString(){
        return stt + " " + ma + " " + ten + " " + lop + " " + gmail + " " + dn;
    }
    
    @Override
    public int compareTo(SinhVien a){
        if(ten.compareTo(a.ten)<0) return -1;
        if(ten.compareTo(a.ten)>0) return 1;
        return 0;
    }
}
