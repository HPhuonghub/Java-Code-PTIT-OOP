/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lophocphan_1;

/**
 *
 * @author DELL
 */
public class HocPhan implements Comparable<HocPhan>{
    private String id,name,groupclass,namegv;

    public HocPhan(String id, String name, String groupclass, String namegv) {
        this.id = id;
        this.name = name;
        this.groupclass = groupclass;
        this.namegv = namegv;
    }
    
    @Override
    public String toString(){
        return groupclass + " " + namegv;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(HocPhan a){
        return groupclass.compareTo(a.groupclass);
    }
}
