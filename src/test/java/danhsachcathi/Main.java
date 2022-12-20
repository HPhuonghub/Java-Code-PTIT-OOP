/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachcathi;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> list = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            CaThi a = new CaThi(i,in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(CaThi i : list){
            System.out.println(i);
        }
    }
}
