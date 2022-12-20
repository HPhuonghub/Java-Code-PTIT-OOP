/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom_1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Group {
    private static Map<Integer, String> hs = new HashMap<>();

    public Group() {
    }
    
    public static void setGroup(Integer a, String s){
        hs.put(a, s);
    }
    
    public static String btn(Integer i){
        return "Bai tap dang ky: " + hs.get(i);
    }
}
