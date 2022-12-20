/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtoanhoadonbanquanao;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Group {
    private String nameid,name;
    private int sl;
    private long gl1,gl2;

    public Group(int n,String nameid, int sl) {
        this.nameid = String.format(nameid + "-%03d", n);
        this.sl = sl;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setGl1(long gl1) {
        this.gl1 = gl1;
    }

    public void setGl2(long gl2) {
        this.gl2 = gl2;
    }

    public String getNameid() {
        return nameid;
    }

    private long gettgg() {
        long s = 0;
        if (sl < 50) {
            s = 0;
        }
        else if (sl < 100) {
            s = gettong() * 15 / 100;
        } else if (sl < 150) {
            s = gettong() * 30 / 100;
        } else{
            s = gettong() * 50 / 100;
        }
        return s;
    }
    
    private long gettong(){
        long s = 0;
        if(nameid.charAt(2)=='1'){
            s = sl*gl1;
        }
        if(nameid.charAt(2)=='2'){
            s = sl*gl2;
        }
        return s;
    }
    
    private long getgpt(){
        return gettong() - gettgg();
    }
    
    @Override
    public String toString(){
        return nameid + " " + name + " " + gettgg() + " " + getgpt();
    }
}
