/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangdiemthanhphan2;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop;
    private float diem1,diem2,diem3;
    
    public SinhVien(String ma, String ten, String lop, float diem1, float diem2, float diem3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    
    public String toString(){
        return ma + " " + ten + " " + lop + " " + String.format("%.1f", diem1) + " " + String.format("%.1f", diem2) + " " + String.format("%.1f", diem3);
    }
    
    public int compareTo(SinhVien a){
        if(ten.compareTo(a.ten)>0) return 1;
        if(ten.compareTo(a.ten)<0) return -1;
        return 1;
    }
}
