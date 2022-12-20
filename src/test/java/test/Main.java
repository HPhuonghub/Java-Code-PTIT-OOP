/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) sc.readObject();
        TreeSet<Pair> set = new TreeSet<>();
        for(Pair x : list){
            set.add(x);
        }
        
    }
}
