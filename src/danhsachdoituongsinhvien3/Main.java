/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongsinhvien3;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<SinhVien> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++){
            SinhVien a = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(SinhVien a : list){
            System.out.println(a);
        }
    }
}
