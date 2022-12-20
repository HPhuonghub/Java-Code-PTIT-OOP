/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketquaxettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class XetTuyen {
    private String name,id;
    private Date sn;
    private double theory,practice;

    public XetTuyen(int n, String name, String sn, double theory, double practice) throws ParseException {
        this.id = String.format("PH%02d", n);
        this.name = name;
        this.sn = new SimpleDateFormat("dd/MM/yyyy").parse(sn);
        this.theory = theory;
        this.practice = practice;
    }
    
    private String getname(){
        String s = name.trim().toLowerCase();
        String[] s1 = s.split("\\s+");
        String s2 = "";
        for(int i=0;i<s1.length;i++){
            s2 += s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1) + " ";
        }
        return s2;
    }
    
    private int getdate(){
        int s = 121 - sn.getYear();
        return s;
    }
    
    private String getavgepoint(){
        double s = (theory + practice)/2;
        if(theory >= 8 && practice >= 8) s += 1;
        else if(theory >= 7.5 && practice >= 7.5) s += 0.5;
        s = Math.round(s);
        if(s>10) s = 10;
        return String.format("%.0f", s);
    }
    
    private String getxeploai(){
        double s = Integer.parseInt(getavgepoint());
        String s1 = "";
        if(s>=9) s1 += "Xuat sac";
        else if(s>=8) s1 += "Gioi";
        else if(s>=7) s1 += "Kha";
        else if(s>=5) s1 += "Trung binh";
        else s1 += "Truot";
        return s1;
    }
    
    @Override
    public String toString(){
        return id + " " + getname() + getdate() + " " + getavgepoint() + " " + getxeploai();
    }
}
