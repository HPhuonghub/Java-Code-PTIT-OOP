/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> list1 = new ArrayList<>();
        ArrayList<HoaDon> list2 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SanPham a = new SanPham(in.nextLine(),in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            list1.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i=1;i<=m;i++){
            String[] s = in.nextLine().split("\\s+");
            String id = s[0];
            long sl = Long.parseLong(s[1]);
            for(SanPham x : list1){
                if(id.contains(x.getId())){
                    HoaDon a = new HoaDon(i,id,sl,x);
                    list2.add(a);
                }
            }
        }
        Collections.sort(list2);
        for(HoaDon x : list2){
            System.out.println(x);
        }
    }
}
