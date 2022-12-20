/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            ThiSinh a = new ThiSinh(in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            list.add(a);
        }
        int d = Integer.parseInt(in.nextLine());
        for(ThiSinh a : list){
            list1.add(a.getAll());
        }
        list1.sort(Comparator.reverseOrder());
        double chuan = list1.get(d-1);
        System.out.println(chuan);
        Collections.sort(list);
        for(ThiSinh b : list){
            System.out.print(b + " ");
            if(b.getAll()>=chuan) System.out.print("TRUNG TUYEN");
            else System.out.print("TRUOT");
            System.out.println("");
        }
    }
}
