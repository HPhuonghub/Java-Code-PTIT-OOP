/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenhat_gianhat;
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
        ArrayList<Nguoi> list = new ArrayList<>();
        while(t-->0){
            Nguoi a = new Nguoi(in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
