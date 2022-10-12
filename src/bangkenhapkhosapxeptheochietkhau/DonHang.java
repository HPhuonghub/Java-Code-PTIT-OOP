/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangkenhapkhosapxeptheochietkhau;

/**
 *
 * @author DELL
 */
class DonHang implements Comparable<DonHang>{
    private String ma,ten;
    private long amount,price,discount,remain;
    
    public DonHang(String ten, long amount, long price) {
        this.ten = ten;
        this.amount = amount;
        this.price = price;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    private void solvediscount(){
        if(amount>10) discount = price * amount /20;
        else if(amount>7 ) discount = price * amount /50;
        else if(amount>4 ) discount = price * amount /100;
        else discount = 0;
    }
    
    private void solveremain(){
        solvediscount();
        remain = price * amount - discount;
    }
    
    @Override
    public String toString(){
        solvediscount();
        solveremain();
        return ma + " " + ten + " " + discount + " " + remain ;
    }

    public String getTen() {
        return ten;
    }
    
    public int compareTo(DonHang a){
        solvediscount();
        a.solvediscount();
        if(discount < a.discount) return 1;
        if(discount > a.discount) return -1;
        return 0;
    }
}
