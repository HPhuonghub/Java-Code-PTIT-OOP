/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongsinhvien2;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++){
            SinhVien a = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
            System.out.println(a);
        }
    }
}
