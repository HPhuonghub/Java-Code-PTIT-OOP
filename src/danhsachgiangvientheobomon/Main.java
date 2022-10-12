/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachgiangvientheobomon;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            GiangVien a = new GiangVien(i,in.nextLine(),in.nextLine());
            list.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i=1;i<=m;i++){
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            String a = "";
            for(int j=0;j<s1.length;j++){
                a += s1[j].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + a.toUpperCase() + ":");
            for(GiangVien h : list){
                if(a.toUpperCase().equals(h.getMon1())){
                    System.out.println(h);
                }
            }
        }
    }
}
