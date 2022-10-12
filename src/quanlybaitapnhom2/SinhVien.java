/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom2;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{

    private String ma,ten,sdt,btn;
    private int nhom;

    public SinhVien(String ma, String ten, String sdt, int nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    public void setBtn(String btn) {
        this.btn = btn;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + sdt + " " + nhom + " " + btn;
    }
    
    @Override
    public int compareTo(SinhVien a){
        if(ma.compareTo(a.ma)>0) return 1;
        if(ma.compareTo(a.ma)<0) return -1;
        return 0;
    }

}
