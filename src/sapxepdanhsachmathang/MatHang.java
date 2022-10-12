/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachmathang;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class MatHang implements Comparable<MatHang>{
    private String ten,loai,ma;
    private float mua,ban,nhuan;
    
    public MatHang(int n, String ten, String loai, float mua, float ban) throws ParseException{
        this.ma = String.format("%1d", n);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.nhuan = ban - mua;
    }
    
    public String toString(){
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", nhuan);
    }
    
    public int compareTo(MatHang a){
        if(nhuan > a.nhuan) return -1;
        if(nhuan < a.nhuan) return 1;
        return 0;
    }
}
