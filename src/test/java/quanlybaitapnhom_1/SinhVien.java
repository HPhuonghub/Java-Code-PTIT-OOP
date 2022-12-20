/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom_1;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String id,name,phone;
    private int gr;

    public SinhVien(String id, String name, String phone, int gr) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gr = gr;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + phone;
    }

    public int getGr() {
        return gr;
    }
}
