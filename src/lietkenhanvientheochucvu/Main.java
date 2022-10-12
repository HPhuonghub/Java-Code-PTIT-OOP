/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkenhanvientheochucvu;
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
            NhanVien a = new NhanVien(i,in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        String s = in.next();
        for(NhanVien i : list){
            if(s.equals(i.getCv())) System.out.println(i);
        }
    }
}
