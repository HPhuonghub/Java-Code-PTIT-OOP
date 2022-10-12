/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongnhanvien;
import java.text.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class NhanVien {
    private String ma,ten,gt,dc,sdt;
    private Date sn,ky;
    
    public NhanVien(int i, String ten, String gt, String sn, String dc, String sdt,  String ky) throws ParseException{
        this.ma = String.format("%05d", i);
        this.ten = ten;
        this.gt = gt;
        this.sn = new SimpleDateFormat("dd/MM/yyyy").parse(sn);
        this.dc = dc;
        this.sdt = sdt;
        this.ky = new SimpleDateFormat("dd/MM/yyyy").parse(ky);
    }
    
    public String toString(){
        return ma + " " + ten + " " + gt + " " + new SimpleDateFormat("dd/MM/yyyy").format(sn) + " " + dc + " " + sdt + " " + new SimpleDateFormat("dd/MM/yyyy").format(ky);
    }
}
