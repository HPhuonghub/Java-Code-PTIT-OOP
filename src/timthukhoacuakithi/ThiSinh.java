/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timthukhoacuakithi;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class ThiSinh implements Comparable<ThiSinh>{
    private String ten,sn;
    private int ma;
    private float mon1,mon2,mon3,tong;

    public float getTong() {
        return tong;
    }
    
    public ThiSinh(int ma, String ten, String sn, float mon1, float mon2, float mon3) throws ParseException{
        this.ma = ma;
        this.ten = ten;
        this.sn = sn;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.tong = mon1 + mon2 + mon3;
    }
    
    public String toString(){
        return ma + " " + ten + " " + sn + " " + String.format("%.1f", tong);
    }
    
    public int compareTo(ThiSinh a){
        if(tong < a.tong) return -1;
        if(tong > a.tong) return 1;
        return 0;
    }
}
