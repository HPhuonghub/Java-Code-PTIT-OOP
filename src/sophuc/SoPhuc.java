/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sophuc;

/**
 *
 * @author DELL
 */
public class SoPhuc {
    private int a,b,c,d;
    
    public SoPhuc(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private void tinh(){
        int so1 = a + c;
        int so2 = b + d;
        int so3 = so1*a - so2*b;
        int so4 = a*so2 + b*so1;
        a = so3;
        b= so4;
        c = so1*so1 - so2*so2;
        d = so1*so2 + so2*so1;
    }
    
    public String toString(){
        tinh();
        String s = "";
        if(b<0&&d<0){
            s = s + a + " - " + b*(-1) + "i, " + c + " - " + d*(-1) +"i";
        }
        else if(b<0){
            s = s + a + " - " + b*(-1) + "i, " + c + " + " + d +"i";
        }
        else if(d<0){
            s = s + a + " + " + b + "i, " + c + " - " + d*(-1) +"i";
        }
        else s = s + a + " + " + b + "i, " + c + " + " + d +"i";
        return s;
    }
}
