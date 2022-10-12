/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timthukhoacuakithi;
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
        ArrayList<ThiSinh> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            ThiSinh a = new ThiSinh(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        float max = list.get(list.size()-1).getTong();
        for(ThiSinh i : list){
            if(max == i.getTong()){
                System.out.println(i);
            }
        }
    }
}
