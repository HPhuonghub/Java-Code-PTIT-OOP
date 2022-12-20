/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timkiemgiangvien;

/**
 *
 * @author DELL
 */
public class GiangVien {
    private String name,subject,code;

    public GiangVien(int n, String name, String subject) {
        this.code = String.format("GV%02d", n);
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    
    private String getsubject(){
        String s = subject.trim().toLowerCase();
        String[] s1 = s.split("\\s+");
        String s2 = "";
        for(int i=0;i<s1.length;i++){
            s2 += s1[i].substring(0 , 1).toUpperCase();
        }
        return s2;
    }
    
    @Override
    public String toString(){
        return code + " " + name + " " + getsubject();
    }
}
