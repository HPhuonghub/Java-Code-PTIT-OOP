/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_triangle_1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
}
