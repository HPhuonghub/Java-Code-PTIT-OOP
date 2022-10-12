/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichhinhtronngoaitieptamgiac;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=1;i<=t;i++){
            Point a = new Point(in.nextDouble(),in.nextDouble());
            Point b = new Point(in.nextDouble(),in.nextDouble());
            Point c = new Point(in.nextDouble(),in.nextDouble());
            a.xuat(a.kc(b), a.kc(c), b.kc(c));
        }
    }
}
