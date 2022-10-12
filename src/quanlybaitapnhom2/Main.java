/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom2;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        int t = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        for(int i =1 ;i<=m;i++){
            String a = in.nextLine();
            for(SinhVien j : list){
                if(j.getNhom()==i) j.setBtn(a);
            }
        }
        
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
