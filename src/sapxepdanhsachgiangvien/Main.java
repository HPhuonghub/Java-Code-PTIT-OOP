/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachgiangvien;
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
        Collections.sort(list);
        for(GiangVien a : list){
            System.out.println(a);
        }
    }
}
