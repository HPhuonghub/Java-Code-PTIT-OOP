/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lophocphan_1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<HocPhan> list = new ArrayList<>();
        Map<String,String> hs = new HashMap<>();
        for(int i=1;i<=t;i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String groupclass = in.nextLine();
            String namegv = in.nextLine();
            HocPhan a = new HocPhan(id,name,groupclass,namegv);
            list.add(a);
            hs.put(id, name);
        }
        int t1 = Integer.parseInt(in.nextLine());
        Collections.sort(list);
        for(int i=1;i<=t1;i++){
            String s = in.nextLine();
            System.out.println("Danh sach nhom lop mon " + hs.get(s) + ":");
            for(HocPhan j : list){
                if(s.equals(j.getId())){
                    System.out.println(j);
                }
            }
        }
        
    }
}
