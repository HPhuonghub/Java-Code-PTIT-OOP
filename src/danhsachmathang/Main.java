/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmathang;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DanhSach> list = new ArrayList();
        for(int i = 1 ;i <= t;i++){
            DanhSach a = new DanhSach(i,in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(DanhSach a : list){
            System.out.println(a);
        }
    }
}
