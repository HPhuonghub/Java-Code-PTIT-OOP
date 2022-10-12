/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangxephang;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{
    private String ten,nop;
    private int ac,submit;
    
    public SinhVien(String ten, String nop) {
        this.ten = ten;
        this.nop = nop;
    }
    
    private void solve(){
        String[] s = nop.split(" ");
        ac = Integer.parseInt(s[0]);
        submit = Integer.parseInt(s[1]);
    }
    
    public String toString(){
        return ten + " " + ac + " " + submit;
    }
    
    public int compareTo(SinhVien a){
        a.solve();
        solve();
        if(ac == a.ac){
            if(submit == a.submit){
                if(ten.compareTo(a.ten)>0) return 1;
                if(ten.compareTo(a.ten)<0) return -1;
                return 0;
            }
            else if(submit > a.submit) return 1;
            else return -1;
        }
        else if(ac < a.ac) return 1;
        else return -1;
    }
}

