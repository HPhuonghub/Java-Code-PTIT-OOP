/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiepnhansinhvienthuctap1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            DoanhNghiep a = new DoanhNghiep(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(DoanhNghiep a : list){
            System.out.println(a);
        }
    }
}
