/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtiendien;
import java.math.*;
/**
 *
 * @author DELL
 */
public class KhachHang {
    private String code,ma;
    private int index;
    private double oldindex,newindex,intomoney,sup,sum;

    public KhachHang(int n,String code, double oldindex, double newindex) {
        this.ma = "KH" + String.format("%02d", n);
        this.code = code;
        this.oldindex = oldindex;
        this.newindex = newindex;
    }
    
    private void solveindex(){
        if(code.equals("KD")) index = 3;
        if(code.equals("NN")) index = 5;
        if(code.equals("TT")) index = 4;
        if(code.equals("CN")) index = 2;
    }
    
    private void solveIntomoney(){
        solveindex();
        intomoney = (newindex - oldindex) * index *550;
    }
    
    private void solvesup(){
        solveIntomoney();
        if((newindex - oldindex) < 50) sup = 0;
        else if((newindex - oldindex) < 101) sup = intomoney*35/100;
        else sup = intomoney;
        sup = Math.round(sup);
    }
    
    private void solvesum(){
        solveIntomoney();
        solvesup();
        sum = sup + intomoney;
    }
    
    public String toString(){
        solveindex();
        solveIntomoney();
        solvesup();
        solvesum();
        return ma + " " + index + " " + String.format("%.0f", intomoney) + " " + String.format("%.0f", sup) + " " + String.format("%.0f", sum);
    }
    
}
