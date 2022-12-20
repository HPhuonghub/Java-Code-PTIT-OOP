/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

/**
 *
 * @author DELL
 */
public class LopHoc {
    private String idgv,idmon;
    private float tonggio;


    public LopHoc(String idgv, String idmon, float tonggio) {
        this.idgv = idgv;
        this.idmon = idmon;
        this.tonggio = tonggio;
    }

    public String getIdgv() {
        return idgv;
    }

    public float getTonggio() {
        return tonggio;
    }
}
