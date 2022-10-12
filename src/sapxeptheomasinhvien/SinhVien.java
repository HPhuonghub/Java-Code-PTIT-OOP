/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeptheomasinhvien;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, lop, email;

    public SinhVien(String ma, String hoten, String lop, String email){
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return ma + " " + hoten + " " + lop + " " + email;
    }
    
    public int compareTo(SinhVien a){
        if(ma.compareTo(a.ma)<0) return -1;
        if(ma.compareTo(a.ma)>0) return 1;
        return 0;
    }
}
