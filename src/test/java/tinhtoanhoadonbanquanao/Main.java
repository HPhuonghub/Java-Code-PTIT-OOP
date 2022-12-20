/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtoanhoadonbanquanao;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<HoaDon> list = new ArrayList<>();
        ArrayList<Group> list1 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            HoaDon a = new HoaDon(in.nextLine(),in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            list.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i=1;i<=m;i++){
            String[] s = in.nextLine().split(" ");
            Group b = new Group(i,s[0], Integer.parseInt(s[1]));
            list1.add(b);
        }
        int n = 1;
        for(Group b : list1){
            for(HoaDon a : list){
                if(b.getNameid().contains(a.getId())){
                    b.setName(a.getName());
                    b.setGl1(a.getGl1());
                    b.setGl2(a.getGl2());
                }
            }
            n++;
        }
        for(Group a : list1){
            System.out.println(a);
        }
    }
}
