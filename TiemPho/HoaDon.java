package TiemPho;

import java.sql.Time;

public class HoaDon {
    String MaHD;
    Mon[] mon;
    String nv1;
    String nv2;
    int ban;
    Time thoigian;
    public HoaDon(String MaHD, Mon[] mon, String nv1, String nv2, int ban) {
        this.MaHD = MaHD;
        this.mon = mon;
        this.nv1 = nv1;
        this.nv2 = nv2;
        this.ban = ban;
    }
    public HoaDon(String MaHD, Mon[] mon, String nv1, String nv2, int ban, Time thoigian) {
        this.MaHD = MaHD;
        this.mon = mon;
        this.nv1 = nv1;
        this.nv2 = nv2;
        this.ban = ban;
        this.thoigian = thoigian;
    }
    String getMaHD() {
        return MaHD;
    }
    Mon[] getmon() {
        return mon;
    }
    String getNV1() {
        return nv1;
    }
    String getNV2() {
        return nv2;
    }
    int getBan() {
        return ban;
    }
    Time thoigian() {
        return thoigian;
    }
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }
    public void setMon(Mon[] mon) {
        this.mon = mon;
    }
    public void setNV1(String nv1) {
        this.nv1 = nv1;
    }
    public void setNV2(String nv2) {
        this.nv2 = nv2;
    }
    public void setBan(int ban) {
        this.ban = ban;
    }
    public void setThoigian(Time thoigian) {
        this.thoigian = thoigian;
    }

    public String toString() {
        String str = "";
        for(int i=0;i<mon.length;i++)
            str+=mon[i].toString();
        return "Hoa don:\nmaHD: "+MaHD+str+"\nnv1: "+nv1+", nv2: "+nv2+"\nban: "+ban+"\nTime: "+thoigian;
    }
    public int tongTien() {
        int s = 0;
        for(int i=0;i<mon.length;i++) {
            if(mon[i].soluong<=0)
                mon[i].soluong=0;
            s+=mon[i].gia*mon[i].soluong;
        }
        return s;
    }
}
