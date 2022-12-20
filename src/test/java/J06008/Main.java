/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> listmh = new ArrayList<>();
        ArrayList<GiangVien> listgv = new ArrayList<>();
        ArrayList<LopHoc> listlh = new ArrayList<>();
        for(int i=1;i<=t1;i++){
            String s = in.nextLine();
            String id = s.substring(0, 4);
            String name = s.substring(5);
            MonHoc a = new MonHoc(id,name);
            listmh.add(a);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t2;i++){
            String s = in.nextLine();
            String id = s.substring(0, 4);
            String name = s.substring(5);
            GiangVien a = new GiangVien(id,name);
            listgv.add(a);
        }
        int t3 = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t3;i++){
            String[] s = in.nextLine().split(" ");
            String idgv = s[0];
            String idmh = s[1];
            float tonggio = Float.parseFloat(s[2]);
            listlh.add(new LopHoc(idgv,idmh,tonggio));
        }
        for (GiangVien x : listgv) {
            for (LopHoc y : listlh) {
                if (x.getId().equals(y.getIdgv())) {
                    x.add(y.getTonggio());
                }
            }
        }
        String s = in.nextLine();
        for(GiangVien x : listgv){
            
        }
    }
}
