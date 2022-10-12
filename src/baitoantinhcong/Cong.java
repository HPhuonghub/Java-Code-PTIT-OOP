/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoantinhcong;

/**
 *
 * @author DELL
 */
public class Cong {
    private String ma,ten,cv;
    private int allowance,totalsalary,bonus,basicsalary,salary,workday;
    
    public Cong(String ten, int basicsalary, int workday, String cv){
        this.ma = "NV01";
        this.ten = ten;
        this.basicsalary = basicsalary;
        this.workday = workday;
        this.cv = cv;
    }
    
    public String toString(){
        solve();
        return ma + " " + ten + " " + salary + " " + bonus + " " + allowance + " " + totalsalary;
    }
    
    private void solve(){
        this.salary = this.basicsalary * this.workday;
        if(this.workday>25) this.bonus = this.salary / 5;
        else if(22<=this.workday && this.workday<=25) this.bonus=this.salary/10;
        else this.bonus=0;
        String s1="GD",s2="PGD",s3="TP",s4="NV";
        if(this.cv.equals(s1)) this.allowance=250000;
        if(this.cv.equals(s2)) this.allowance=200000;
        if(this.cv.equals(s3)) this.allowance=180000;
        if(this.cv.equals(s4)) this.allowance=150000;
        this.totalsalary = this.salary + this.bonus + this.allowance;
    }
}
