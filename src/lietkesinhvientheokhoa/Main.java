/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheokhoa;

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
            String s = in.next();
            String s1 = s.substring(2);
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(SinhVien j : list){
                if(s1.equals(j.getLop().substring(1, 3))){
                    System.out.println(j);
                }
            }
        }
    }
}
