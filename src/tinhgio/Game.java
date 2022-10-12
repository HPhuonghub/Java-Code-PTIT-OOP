/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgio;
import java.text.*;
import java.util.*;
/**
 *
 * @author DELL
 */
class Game implements Comparable<Game>{
    private String ma,ten;
    private Date in,out;
    private int hours,mins;

    public Game(String ma, String ten, String in, String out) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.in = new SimpleDateFormat("HH:mm").parse(in);
        this.out = new SimpleDateFormat("HH:mm").parse(out);
    }
    
    private void solve(){
        hours = (out.getHours()*60+out.getMinutes()-in.getHours()*60-in.getMinutes())/60;
        mins = (out.getHours()*60+out.getMinutes()-in.getHours()*60-in.getMinutes())%60;
    }
    
    @Override
    public String toString(){
        solve();
        return ma + " " + ten + " " + hours + " gio " + mins + " phut";
    }
    
    public int compareTo(Game a){
        solve();
        a.solve();
        if(hours*60+mins-a.hours*60-a.mins>0) return -1;
        if(hours*60+mins-a.hours*60-a.mins<0) return 1;
        return 0;
    }
    
}
