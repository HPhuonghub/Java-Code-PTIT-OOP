/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheonghanh;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        int q = Integer.parseInt(in.nextLine());
        for(int i=1;i<=q;i++){
            String s = in.nextLine();
            String[] list1 = s.split(" ");
            String s1 = "";
            for(int j=0;j<=1;j++){
                s1 += list1[j].charAt(0);
            }
            s1 = s1.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for(SinhVien j : list){
                if(s1.equals("CN") || s1.equals("AT")){
                    if(s1.equals(j.getMa().substring(5, 7)) && j.getLop().substring(0 , 1).equals("E") == false){
                        System.out.println(j);
                    }
                }
                else{
                    if(s1.equals(j.getMa().substring(5, 7))){
                        System.out.println(j);
                    }
                }
            }
        }
    }
}
