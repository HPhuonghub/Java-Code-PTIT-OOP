/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracuudonhang;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            DonHang a = new DonHang(in.nextLine(),in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            list.add(a);
        }
        for(DonHang a : list){
            System.out.println(a);
        }
    }
}
