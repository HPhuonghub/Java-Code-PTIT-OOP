/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002;

/**
 *
 * @author DELL
 */
public class HoaDon implements Comparable<HoaDon>{
    private String id;
    private long sl;
    private SanPham sp;

    public HoaDon(int n,String id, long sl, SanPham sp) {
        this.id = String.format(id + "-%03d", n);
        this.sl = sl;
        this.sp = sp;
    }
    
    private long gettongtien(){
        if(id.charAt(2)=='1'){
            return sp.getGl1() * sl;
        }
        else {
            return sp.getGl2() * sl;
        }
    }
    
    private long getgiamgia(){
        if(sl<50) return 0;
        else if(sl<100) return gettongtien() * 15 / 100;
        else if(sl<150) return gettongtien() * 30 / 100;
        else return gettongtien() * 50 / 100;
    }
    
    private long getphaitra(){
        return gettongtien() - getgiamgia();
    }
    
    @Override
    public String toString(){
        return id + " " + sp.getName() + " " + getgiamgia() + " " + getphaitra();
    }
    
    @Override
    public int compareTo(HoaDon a){
        if(getphaitra() > a.getphaitra()) return -1;
        if(getphaitra() < a.getphaitra()) return 1;
        return 0;
    }
}
