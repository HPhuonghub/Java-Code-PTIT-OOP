/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangdiemthanhphan1;
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
        for (int i = 1; i <= t; i++) {
            SinhVien a = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        int i = 1;
        for (SinhVien a : list) {
            System.out.print(i++ + " ");
            System.out.println(a);
        }
    }
}
