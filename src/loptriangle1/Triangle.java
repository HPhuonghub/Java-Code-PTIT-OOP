/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loptriangle1;
import java.math.*;
/**
 *
 * @author DELL
 */
public class Triangle {
    private Point a = new Point();
    private double x1,x2,x3;
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int valid(){
        x1 = (double)Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
        x2 = (double)Math.sqrt(Math.pow(a.x-c.x, 2)+Math.pow(a.y-c.y, 2));
        x3 = (double)Math.sqrt(Math.pow(c.x-b.x, 2)+Math.pow(c.y-b.y, 2));
        if(x1 + x2 <= x3) return 0;
        else if(x1 + x3 <= x2) return 0;
        else if(x3 + x2 <= x1) return 0;
        else return 1;
    }
    
    
    public String getPerimeter(){
        return String.format("%.3f", x1+x2+x3);
    }
}
