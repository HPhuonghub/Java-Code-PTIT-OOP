/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachmathang;
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
        ArrayList<MatHang> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            MatHang a = new MatHang(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(MatHang a : list){
            System.out.println(a);
        }
    }
}
