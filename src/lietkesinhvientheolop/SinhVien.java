/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheolop;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma, hoten, lop, email;

    public SinhVien(String ma, String hoten, String lop, String email){
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }
    
    public String toString() {
        return ma + " " + hoten + " " + lop + " " + email;
    }
}
