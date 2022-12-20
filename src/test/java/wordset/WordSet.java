/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordset;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class WordSet {
    private String s;
    public WordSet(String s) {
        this.s = s;
    }
    public String union(WordSet s2){
        String[] a= s.split("\\s");
        String[] b= s2.s.split("\\s");
        TreeSet<String> ts =new TreeSet<>();
        for (String x:a){
            ts.add(x.toLowerCase());
        }
        for (String x:b){
            ts.add(x.toLowerCase());
        }
        String kq="";
        for (String x:ts){
            kq+=x+" ";
        }
        return kq;
    }
     public String intersection(WordSet s2){
        String[] a= s.split("\\s");
        String[] b= s2.s.split("\\s");
        TreeSet<String> x1=new TreeSet<>();
        TreeSet<String> x2=new TreeSet<>();
        for (String i:a){
            x1.add(i.toLowerCase());
        }
        for (String i:b){
            x2.add(i.toLowerCase());
        }
        String kq="";
        for (String i:x1){
            if (x2.contains(i)){
                kq+=i+" ";
            }
        }
        return kq;
    }
}
