/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007;

/**
 *
 * @author DELL
 */
public class GiangVien {
    private String id,name;
    private double t;

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
        t = 0;
    }
    
    public double add(double t){
        return this.t += t;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + String.format("%.2f", t);
    }
}
