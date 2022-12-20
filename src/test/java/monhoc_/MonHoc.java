/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monhoc_;

/**
 *
 * @author DELL
 */
public class MonHoc implements Comparable<MonHoc>{
    private String id,name,lt,th;
    private int tc;

    public String getTh() {
        return th;
    }

    public MonHoc(String id, String name, int tc, String lt, String th) {
        this.id = id;
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.tc = tc;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + tc + " " + lt + " " + th;
    }
    
    @Override
    public int compareTo(MonHoc a){
        return id.compareTo(a.id);
    }
}
