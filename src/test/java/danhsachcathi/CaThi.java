/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachcathi;
import java.text.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class CaThi implements Comparable<CaThi>{
    private Date date;
    private String id,hours,idphong;
    private int m;

    public CaThi(int n, String date, String hours, String idphong) throws ParseException {
        this.id = String.format("C%03d", n);
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.hours = hours;
        this.idphong = idphong;
        String[] s = hours.split(":");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        this.m = a*60 + b;
    }
    
    @Override
    public String toString(){
        return id + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + hours + " " + idphong;
    }
    
    public int compareTo(CaThi a){
        if(date.compareTo(a.date)==0){
            if(m<a.m) return -1;
            else if(m>a.m) return 1;
            else return id.compareTo(a.id);
        }
        else if(date.compareTo(a.date)>0) return 1;
        else return -1;
    }
}
