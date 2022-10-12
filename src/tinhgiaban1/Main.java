/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgiaban1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SanPham a = new SanPham(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        for(SanPham i : list){
            System.out.println(i);
        }
    }
}
