/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichtamgiac;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class Point {
    private double x,y;
    
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    
    public double kc(Point a){
        double i = (double)Math.sqrt(Math.pow(this.x-a.x, 2) + Math.pow(this.y-a.y, 2));
        return i;
    }
    
    public void xuat(double x1,double x2,double x3){
        if(x1 + x2 <= x3) System.out.println("INVALID");
        else if(x1 + x3 <= x2) System.out.println("INVALID");
        else if(x2 + x3 <= x1) System.out.println("INVALID");
        else{
            double s = (double)1/4*Math.sqrt((x1+x2+x3)*(x1+x2-x3)*(x1-x2+x3)*(-x1+x2+x3));
            System.out.printf("%.2f",s);
            System.out.println("");
        }
    }
}
