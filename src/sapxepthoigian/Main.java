/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepthoigian;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Time> list = new ArrayList();
        for(int i=1;i<=t;i++){
            Time a = new Time(in.nextInt(),in.nextInt(),in.nextInt());
            list.add(a);
        }
        Collections.sort(list);
        for(Time a : list){
            System.out.println(a);
        }
    }
}
