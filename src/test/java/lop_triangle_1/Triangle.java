/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_triangle_1;

/**
 *
 * @author DELL
 */
public class Triangle {
    private Point a,b,c;
    private double x1,x2,x3;
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        x1 = a.distance(b);
        x2 = a.distance(c);
        x3 = b.distance(c);
        if(x1 + x2 <= x3) return false;
        else if(x1 + x3 <= x2) return false;
        else if(x3 + x2 <= x1) return false;
        else return true;
    }

    public String getPerimeter() {
        x1 = a.distance(b);
        x2 = a.distance(c);
        x3 = b.distance(c);
        return String.format("%.3f", x1+x2+x3);
    }
}
