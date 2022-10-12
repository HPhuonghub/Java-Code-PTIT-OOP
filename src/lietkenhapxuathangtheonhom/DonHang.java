/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkenhapxuathangtheonhom;
import java.math.*;
/**
 *
 * @author DELL
 */
class DonHang implements Comparable<DonHang>{
    private String code;
    private double amountin,price,amountout,sum,tax;
    
    public DonHang(String code, double amountin) {
        this.code = code;
        this.amountin = amountin;
    }

    public String getCode() {
        return code;
    }
    
    private void solveamountout(){
        if (code.substring(0, 1).equals("A")) {
            amountout = amountin * 6 / 10;
        }
        amountout = Math.round(amountout);
        if (code.substring(0, 1).equals("B")) {
            amountout = amountin * 7 / 10;
        }
        amountout = Math.round(amountout);
    }
    
    private void solveprice(){
        if(code.substring(4).equals("Y")) price = 110000;
        if(code.substring(4).equals("N")) price = 135000;
    }
    
    private void solvesum(){
        solveamountout();
        solveprice();
        sum = amountout * price;
    }
    
    private void solvetax(){
        solvesum();
        if(code.substring(4).equals("Y") && code.substring(0,1).equals("A")) tax = sum*8/100;
        if(code.substring(4).equals("N") && code.substring(0,1).equals("A")) tax = sum*11/100;
        if(code.substring(4).equals("Y") && code.substring(0,1).equals("B")) tax = sum*17/100;
        if(code.substring(4).equals("N") && code.substring(0,1).equals("B")) tax = sum*22/100;
    }
    
    @Override
    public String toString(){
        solveamountout();
        solveprice();
        solvesum();
        solvetax();
        return code + " " + String.format("%.0f", amountin) + " " + String.format("%.0f", amountout) + " " + String.format("%.0f", price) + " " + String.format("%.0f", sum) + " " + String.format("%.0f", tax);
    }
    
    public int compareTo(DonHang a){
        solveamountout();
        solveprice();
        solvesum();
        solvetax();
        a.solveamountout();
        a.solveprice();
        a.solvesum();
        a.solvetax();
        if(tax < a.tax) return 1;
        if(tax > a.tax) return -1;
        return 0;
    }
}
