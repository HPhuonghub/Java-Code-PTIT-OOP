/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepketquatuyensinh;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String id,name;
    private double math,physics,chemistry;

    public ThiSinh(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }
    
    private String getuutien(){
        String s = "";
        if(id.charAt(2)=='1') s += "0.5";
        else if(id.charAt(2)=='2') s += "1";
        else if(id.charAt(2)=='3') s += "2.5";
        return s;
    }
    
    private double getall(){
        double s = math*2 + physics + chemistry;
        switch (id.charAt(2)) {
            case '1':
                s += 0.5;
                break;
            case '2':
                s += 1;
                break;
            case '3':
                s += 2.5;
                break;
            default:
                break;
        }
        return s;
    }
    
    private String getxet(){
        String a = "";
        if(getall() < 24) a += "TRUOT";
        else a += "TRUNG TUYEN";
        return a;
    }
    
    private String getdiem(){
        String s = "";
        if(getall()*2 % 2 == 0) s = String.format("%.0f", getall());
        else s = String.format("%.1f", getall());
        return s;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + getuutien() + " " + getdiem() + " " + getxet();
    }
    
    @Override
    public int compareTo(ThiSinh a){
        if(getall() > a.getall()) return -1;
        else if(getall() > a.getall()) return 1;
        else if(getall() == a.getall()){
            return id.compareTo(a.id);
        }
        return 0;
    }
}
