/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xephanghocsinh;

/**
 *
 * @author DELL
 */
public class HocSinh {
    private String code,name,conduct;
    private double point;
    private int stt;

    public HocSinh(int n, String name, double point) {
        this.stt = n;
        this.code = String.format("HS%02d", n);
        this.name = name;
        this.point = point;
    }

    public int getStt() {
        return stt;
    }

    public double getPoint() {
        return point;
    }
    
    private void solve(){
        if(point<5) conduct = "Yeu";
        else if(point<7) conduct = "Trung Binh";
        else if(point<9) conduct = "Kha";
        else conduct = "Gioi";
    }
    
    @Override
    public String toString(){
        solve();
        return code + " " + name + " " + point + " " + conduct;
    }
}
