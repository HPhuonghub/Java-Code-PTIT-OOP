/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtoanphanso;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main( String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=1;i<=t;i++){
            PhanSo a = new PhanSo(in.nextLong(),in.nextLong());
            PhanSo b = new PhanSo(in.nextLong(),in.nextLong());
            a.tinh(b);
        }
    }
}
