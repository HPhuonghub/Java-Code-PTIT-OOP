/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemdanh_1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class DiemDanh {
    private static Map<String, Integer> hm = new HashMap<>();

    public DiemDanh() {
    }
    
    public static void getDD(String s, Integer a){
        hm.put(s, a);
    }
    
    public String getInf(String s){
        return s + " " + hm.get(s);
    }
}
