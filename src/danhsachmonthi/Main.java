/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonthi;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> list = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            MonThi a = new MonThi(in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(MonThi a : list){
            System.out.println(a);
        }
    }
}
