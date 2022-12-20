/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002;

/**
 *
 * @author DELL
 */
public class SanPham {
    private String id,name;
    private long gl1,gl2;

    public SanPham(String id, String name, long gl1, long gl2) {
        this.id = id;
        this.name = name;
        this.gl1 = gl1;
        this.gl2 = gl2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getGl1() {
        return gl1;
    }

    public long getGl2() {
        return gl2;
    }
    
}
