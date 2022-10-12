/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangkenhapkhosapxeptheochietkhau;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            DonHang a = new DonHang(in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            list.add(a);
        }
        ArrayList<String> lists = new ArrayList<>();
        for (DonHang i : list) {
            String[] s = i.getTen().toUpperCase().split(" ");
            String s1 = s[0].substring(0, 1) + s[1].substring(0, 1);
            int dem = 0;
            lists.add(s1);
            for (String j : lists) {
                if (s1.equals(j)) {
                    dem++;
                }
            }
            i.setMa(s1 + String.format("%02d", dem));
        }
        Collections.sort(list);
        for(DonHang i : list){
            System.out.println(i);
        }
    }
}
