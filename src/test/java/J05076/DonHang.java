/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05076;

/**
 *
 * @author DELL
 */
public class DonHang {
    private long sl,dg,slx,tgtx;
    private MatHang mh;

    public DonHang(MatHang mh, long sl, long dg, long slx) {
        this.mh = mh;
        this.sl = sl;
        this.dg = dg;
        this.slx = slx;
    }
    
    private long gettgtn(){
        return sl*dg;
    }
    
    private long gettx(){
        return slx*dg;
    }

    private long gettgtx(){
        if(mh.getL().equals("A")) tgtx = gettx() * 108 / 100;
        else if(mh.getL().equals("B")) tgtx = gettx() * 105 / 100;
        else if(mh.getL().equals("C")) tgtx = gettx() * 102 / 100;
        return tgtx;
    }
    
    @Override
    public String toString(){
        return mh.getId() + " " + mh.getName() + " " + gettgtn() + " " + gettgtx();
    }
}
