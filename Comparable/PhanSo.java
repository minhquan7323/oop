package Comparable;

public class PhanSo implements Comparable {
    private int tu, mau;
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
     public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    public String toString () {
        return tu + "/" + mau;
    }
    public boolean equals (Comparable other) {
        return (1.0*tu/mau == 1.0*((PhanSo)other).getTu()/((PhanSo)other).getMau());
    }
    public int compareTo (Comparable other) {
        int otherTu = ((PhanSo)other).getTu();
        int otherMau = ((PhanSo)other).getMau();
        if (this.equals(other))
           return 0;
        if(tu*otherMau > otherTu*mau)
           return 1;
        return -1;
    }
}