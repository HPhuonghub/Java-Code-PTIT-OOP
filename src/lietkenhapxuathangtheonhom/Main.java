/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkenhapxuathangtheonhom;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            DonHang a = new DonHang(in.nextLine(),Double.parseDouble(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        String s = in.nextLine();
        for(DonHang i : list){
            if(s.equals(i.getCode().substring(0, 1))) System.out.println(i);
        }
    }
}
