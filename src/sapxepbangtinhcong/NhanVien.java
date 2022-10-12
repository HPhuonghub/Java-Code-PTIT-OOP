/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepbangtinhcong;

/**
 *
 * @author DELL
 */
class NhanVien implements Comparable<NhanVien>{
    private String ten,cv,ma;
    private int salary,salarys,nc,thuong,phucap,tong;

    public NhanVien(int n, String ten, int salary, int nc, String cv) {
        this.ma = "NV" + String.format("%02d", n);
        this.ten = ten;
        this.cv = cv;
        this.salary = salary;
        this.nc = nc;
    }
    
    private void solve(){
        salarys = nc * salary;
        if(nc>=25) thuong = salarys /5;
        else if(nc>=22) thuong = salarys /10;
        else thuong = 0;
        if(cv.equals("GD")) phucap = 250000;
        if(cv.equals("PGD")) phucap = 200000;
        if(cv.equals("TP")) phucap = 180000;
        if(cv.equals("NV")) phucap = 150000;
        tong = salarys + thuong + phucap;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + salarys + " " + thuong + " " + phucap + " " + tong;
    }
    
    @Override
    public int compareTo(NhanVien a){
        solve();
        a.solve();
        if(tong < a.tong) return 1;
        if(tong > a.tong) return -1;
        return 0;
    }
}
