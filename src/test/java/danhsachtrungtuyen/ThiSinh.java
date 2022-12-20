/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String id,name;
    private double math,physics,chemistry,all;
    private double diemchuan;

    public double getAll() {
        return gettong();
    }
    
    public ThiSinh(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }
    
    private String getname(){
        String s = name.trim().toLowerCase();
        String[] s1 = s.split("\\s+");
        String s2 = "";
        for(int i=0;i<s1.length;i++){
            s2 += s1[i].substring(0,1).toUpperCase() + s1[i].substring(1) + " ";
        }
        return s2;
    }
    
    private double gettong(){
        all = math*2 + physics + chemistry;
        if(id.charAt(2)=='1') all += 0.5;
        else if(id.charAt(2)=='2') all += 1;
        else if(id.charAt(2)=='3') all += 2.5;
        return all;
    }
    
    private String getuutien(){
        String s = "";
        if(id.charAt(2)=='1') s += "0.5";
        else if(id.charAt(2)=='2') s += "1";
        else if(id.charAt(2)=='3') s += "2.5";
        return s;
    }
    
    private String gettongs(){
        if(gettong()*2%2==0) return String.format("%.0f", gettong());
        else return String.format("%.1f", gettong());
    }
    
    @Override
    public String toString(){
        return id + " " + getname() + getuutien() + " " + gettongs();
    }
    
    @Override
    public int compareTo(ThiSinh a){
        if(gettong() > a.gettong()) return -1;
        if(gettong() < a.gettong()) return 1;
        return 0;
    }
}
