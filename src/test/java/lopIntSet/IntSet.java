/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lopIntSet;
import java.util.*;
/**
 *
 * @author DELL
 */
public class IntSet {
    private Set<Integer> set = new TreeSet<>();
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }
    
    public IntSet union(IntSet s2) {
        int[] x = new int[2000];
        int dem = 0;
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<s2.a.length;i++){
            set.add(s2.a[i]);
        }
        for(Integer s : set){
            x[dem++] = s;
        }
        IntSet t = new IntSet(x);
        return t;
    }
    
    @Override
    public String toString(){
        String kq = "";
        for(int i=0;i<a.length;i++){
            if (a[i] > 0){
                kq += String.valueOf(a[i]) + " ";
            }
        }
        return kq;
    }
}
