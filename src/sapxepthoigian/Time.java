/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepthoigian;
import java.util.*;
import java.text.*;

/**
 *
 * @author DELL
 */
class Time implements Comparable<Time>{
    private int seconds,minutes,hours,tong;
    
    public Time(int hours, int minutes, int seconds )throws ParseException{
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public String toString(){
        return hours + " " + minutes + " " + seconds;
    }
    
    public int compareTo(Time a){
        this.tong = this.hours*3600 + this.minutes*60 + this.seconds;
        a.tong = a.hours*3600 + a.minutes*60 + a.seconds;
        if(this.tong < a.tong) return -1;
        if(this.tong > a.tong) return 1;
        return 0;
    }
}
