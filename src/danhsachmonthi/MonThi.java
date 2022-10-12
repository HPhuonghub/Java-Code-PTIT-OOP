/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonthi;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
class MonThi implements Comparable<MonThi>{
    private String ma,ten,hinhthuc;
    
    public MonThi(String ma, String ten, String hinhthuc) throws IOException{
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    
    public String toString(){
        return ma + " " + ten + " " + hinhthuc;
    }
    
    public int compareTo(MonThi a){
        if(ma.compareTo(a.ma)<0) return -1;
        if(ma.compareTo(a.ma)>0) return 1;
        return 0;
    }
}
