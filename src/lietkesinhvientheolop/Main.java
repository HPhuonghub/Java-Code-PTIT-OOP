/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheolop;
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
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(SinhVien j : list){
                if(s.equals(j.getLop())){
                    System.out.println(j);
                }
            }
        }
    }
}
