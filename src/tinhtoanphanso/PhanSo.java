/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtoanphanso;

/**
 *
 * @author DELL
 */
public class PhanSo {
    private long tu,mau;
    
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    private long ucln(long a,long b){
        while(a*b!=0){
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        return a+b;
    }
    
    public void tinh(PhanSo a){
        long tuso = this.tu * a.mau + this.mau * a.tu;
        long mauso = this.mau * a.mau;
        long i = ucln(tuso,mauso);
        tuso = (tuso/i)*(tuso/i);
        mauso = (mauso/i)*(mauso/i);
        System.out.print(tuso + "/" + mauso + " ");
        long tuso1 = this.tu*tuso*a.tu;
        long mauso1 = this.mau*mauso*a.mau;
        long k = ucln(tuso1,mauso1);
        System.out.print(tuso1/k + "/" + mauso1/k);
        System.out.println("");
    }
}
