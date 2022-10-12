/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sophuc;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=1;i<=t;i++){
            SoPhuc a = new SoPhuc(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
            System.out.println(a);
        }
    }
}
