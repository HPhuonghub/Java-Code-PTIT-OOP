/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiepnhansinhvienthuctap2;

/**
 *
 * @author DELL
 */
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    private int nhan;
    
    public DoanhNghiep(String ma, String ten, int nhan){
        this.ma = ma;
        this.ten = ten;
        this.nhan = nhan;
    }

    public int getNhan() {
        return nhan;
    }
    
    public String toString(){
        return ma + " " + ten + " " + nhan;
    }
    
    public int compareTo(DoanhNghiep a){
        if(nhan==a.nhan){
            if(ma.compareTo(a.ma)>0) return 1;
            if(ma.compareTo(a.ma)<0) return -1;
            return 0;
        }
        else if(nhan>a.nhan) return -1;
        else return 1;
    }
}
