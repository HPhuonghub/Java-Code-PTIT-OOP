/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhgio;
import java.text.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Game> list = new ArrayList<>();
        for(int i =1;i<=t;i++){
            Game a = new Game(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(Game i : list){
            System.out.println(i);
        }
    }
}
