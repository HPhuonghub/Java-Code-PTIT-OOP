/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xephanghocsinh;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<HocSinh> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            HocSinh a = new HocSinh(i,in.nextLine(),Double.parseDouble(in.nextLine()));
            list.add(a);
        }
        for(HocSinh i : list){
            list1.add(i.getPoint());
        }
        list1.sort(Comparator.reverseOrder());
        HashMap<Integer,Integer> hm = new HashMap<>();
        int dem = 1;
        for(HocSinh i : list){
            for(int j=0;j<list1.size();j++){
                if(i.getPoint()==list1.get(j)){
                    hm.put(i.getStt(), j+1);
                    break;
                }
            }
        }
        for(HocSinh i : list){
            System.out.println(i + " " + hm.get(dem++));
        }
    }
}
