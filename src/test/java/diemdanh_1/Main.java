/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemdanh_1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        for(int i=1;i<=t;i++){
            String[] s = in.nextLine().split("\\s+");
            int diem = 10;
            for(int j=0;j<s[1].length();j++){
                if(s[1].charAt(j)=='v'){
                    diem -= 2;
                }
                if(s[1].charAt(j)=='m'){
                    diem -= 1;
                }
            }
            if(diem < 0) diem = 0;
            DiemDanh.getDD(s[0], diem);
        }
        for(SinhVien a : list){
            System.out.println(a);
        }
    }
}
