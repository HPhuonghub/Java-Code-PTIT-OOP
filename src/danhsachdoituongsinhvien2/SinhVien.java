/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongsinhvien2;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma, hoten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int n, String hoten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }
    private String chuanHoa(String s){
        s = s.trim().toLowerCase();
        String[] list = s.split("\\s+");
        String a = "";
        int n = list.length;
        for(int i=0;i<n;i++){
            String m = "";
            m += list[i].charAt(0);
            m = m.toUpperCase();
            a = a + " " + m + list[i].substring(1);
        }
        return a;
    }

    public String toString() {
        return ma + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
}
