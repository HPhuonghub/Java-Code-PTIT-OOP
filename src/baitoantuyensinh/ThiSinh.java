/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoantuyensinh;

/**
 *
 * @author DELL
 */
public class ThiSinh {
    private String code,name,xet,uutien,tong;
    private float maths,physic,chemistry,totalpoint;
    
    public ThiSinh(String code, String name, float maths, float physic, float chemistry){
        this.code = code;
        this.name = name;
        this.maths = maths;
        this.physic = physic;
        this.chemistry = chemistry;
    }
    
    private void solve(){
        float sum = 0;
        String s = this.code.substring(0, 3);
        String s1 = "KV1", s2 = "KV2" , s3 = "KV3";
        if (s.equals(s1)) {
            sum += 0.5;
            this.uutien = "0.5";
        }
        if (s.equals(s2)) {
            sum += 1;
            this.uutien = "1";
        }
        if (s.equals(s3)) {
            sum += 2.5;
            this.uutien = "2.5";
        }
        this.totalpoint = this.maths*2 + this.physic + this.chemistry;
        sum = sum + this.totalpoint;
        if(sum<24) this.xet = "TRUOT";
        else this.xet = "TRUNG TUYEN";
        if((this.totalpoint*2)%2==1) this.tong = String.format("%.1f", this.totalpoint);
        else this.tong = String.format("%.0f", this.totalpoint);
    }
    
    public String toString(){
        solve();
        return code + " " + name + " " + uutien + " " + tong + " " + xet;
    }
}
