/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmathang;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class DanhSach implements Comparable<DanhSach>{
    private String ten,dv,ma;
    private int mua,ban,lai;
    
    public DanhSach(int n,String ten,String dv,int mua,int ban) throws ParseException{
        this.ma = "MH" + String.format("%03d",n );
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
        this.lai = this.ban - this.mua;
    }
    
    public String toString(){
        return ma + " " + ten + " " + dv + " " + mua + " " + ban + " " + lai;
    }
    
    public int compareTo(DanhSach a){
        if(this.lai > a.lai) return -1;
        if(this.lai < a.lai) return 1;
        return 0;
    }
}
