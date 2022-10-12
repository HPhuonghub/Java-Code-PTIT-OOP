/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongsinhvien1;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma,ten,lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(int n, String ten, String lop, String ns, float gpa) throws ParseException{
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
}
