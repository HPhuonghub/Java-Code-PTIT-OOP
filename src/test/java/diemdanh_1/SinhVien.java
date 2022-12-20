/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemdanh_1;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String id,name,cl;
    private DiemDanh dd;

    public SinhVien(String id, String name, String cl) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.dd = new DiemDanh();
    }
    
    private String getxet(){
        String s1 = "";
        String[] s = dd.getInf(id).split("\\s+");
        if(Integer.parseInt(s[1])==0){
            s1 = s[1] + " KDDK";
        }
        else{
            s1 = s[1];
        }
        return s1;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + cl + " " + getxet();
    }
}
