/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xettuyen;
import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        ArrayList<XetTuyen> list = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            XetTuyen a = new XetTuyen(i,in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            list.add(a);
        }
        for(XetTuyen a : list){
            System.out.println(a);
        }
    }
}
