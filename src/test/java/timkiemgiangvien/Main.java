/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timkiemgiangvien;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = Integer.parseInt(in.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        for(int i=1;i<=t1;i++){
            GiangVien a = new GiangVien(i,in.nextLine(),in.nextLine());
            list.add(a);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t2;i++){
            String s = in.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GiangVien x : list){
                if(x.getName().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
        }
    }
}
