/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachdoituongnhanvien;

import java.text.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            NhanVien a = new NhanVien(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(NhanVien a : list){
            System.out.println(a);
        }
    }
}
