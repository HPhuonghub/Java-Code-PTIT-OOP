/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monhoc_;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            MonHoc a = new MonHoc(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(MonHoc a : list){
            if(!a.getTh().equals("Truc tiep")){
                System.out.println(a);
            }
        }
    }
}
