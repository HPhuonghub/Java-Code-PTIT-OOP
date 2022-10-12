/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenhat_gianhat;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
class Nguoi implements Comparable<Nguoi>{
    private String danh,ten;
    private Date sn;
    
    public Nguoi(String danh) throws ParseException{
        this.danh = danh;
        String[] s = danh.split(" ");
        this.ten = s[0];
        sn = new SimpleDateFormat("dd/MM/yyyy").parse(s[1]);
    }
    
    @Override
    public String toString(){
        return ten;
    }
    
    @Override
    public int compareTo(Nguoi a){
        if(sn.after(a.sn)) return -1;
        if(sn.before(a.sn)) return 1;
        return 0;
    }
}
