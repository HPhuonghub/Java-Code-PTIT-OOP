/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoantinhcong;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cong a = new Cong(in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),in.nextLine());
        System.out.println(a);
    }
}
