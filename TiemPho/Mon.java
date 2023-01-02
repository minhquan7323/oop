package TiemPho;

public class Mon {
    String tenMon, dvt;
    int gia, soluong;

    public Mon(String tenMon, String dvt, int gia, int soluong) {
        this.tenMon = tenMon;
        this.dvt = dvt;
        this.gia = gia;
        this.soluong = soluong;
    }

    String getTenMon() {
        return tenMon;
    }
    String getDvt() {
        return dvt;
    }
    int getGia() {
        return gia;
    }
    int getSoluong() {
        return soluong;
    }
    
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    public void setDvt(String dvt) {
        this.dvt = dvt;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String toString() {
        return "\nmon: "+tenMon+", dvt: "+dvt+", gia: "+gia+", so luong: "+soluong+"";
    }
}
