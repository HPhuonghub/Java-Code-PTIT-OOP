/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtienphong;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author DELL
 */
class KhachHang implements Comparable<KhachHang>{
    private String name,id,name1;
    private Date receive,pay;
    private int idphong,phatsinh;
    private long ngayo;

    public KhachHang(int n, String name, int idphong, String receive, String pay, int phatsinh) throws ParseException {
        this.id = String.format("KH%02d", n);
        this.name = name;
        this.idphong = idphong;
        this.receive = new SimpleDateFormat("dd/MM/yyyy").parse(receive);
        this.pay = new SimpleDateFormat("dd/MM/yyyy").parse(pay);
        this.phatsinh = phatsinh;
    }
    
    private long getngayo(){
        ngayo = pay.getTime() - receive.getTime();
        long a = ngayo / (3600*24*1000) + 1;
        return a;
    }
    
    private void solvename(){
        String s0 = name.trim().toLowerCase();
        String[] s = s0.split("\\s+");
        String s1 = "";
        for(int i=0;i<s.length;i++){
            s1 += s[i].substring(0, 1).toUpperCase();
            s1 += s[i].substring(1);
            s1 += " ";
        }
        name1 = s1;
    }
    
    private long gettien(){
        long gia = 0;
        if(idphong/100==1) gia = 25;
        else if(idphong/100==2) gia = 34;
        else if(idphong/100==3) gia = 50;
        else if(idphong/100==4) gia = 80;
        return getngayo()*gia + phatsinh;
    }
    
    @Override
    public String toString(){
        solvename();
        return id + " " + name1 + idphong + " " + getngayo() + " " + gettien();
    }
    
    @Override
    public int compareTo(KhachHang a){
        if(gettien() > a.gettien()) return -1;
        if(gettien() < a.gettien()) return 1;
        return 0;
    }
}
