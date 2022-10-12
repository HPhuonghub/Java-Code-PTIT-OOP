/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangketienluong;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            NhanVien a = new NhanVien(i,in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),in.nextLine());
            list.add(a);
        }
        int sum = 0;
        for(NhanVien i : list){
            sum += i.getTong();
            System.out.println(i);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
