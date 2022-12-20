/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05076;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        ArrayList<DonHang> list1 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            MatHang a = new MatHang(in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i=1;i<=m;i++){
            String[] s = in.nextLine().split("\\s+");
            String ma = s[0];
            long slnhap = Long.parseLong(s[1]);
            long dgnhap = Long.parseLong(s[2]);
            long slxuat = Long.parseLong(s[3]);
            for(MatHang x : list){
                if(ma.equals(x.getId())){
                    DonHang a = new DonHang(x,slnhap,dgnhap,slxuat);
                    list1.add(a);
                }
            }
        }
        for (DonHang x : list1) {
            System.out.println(x);
        }
    }
}
