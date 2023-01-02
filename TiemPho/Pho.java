package TiemPho;
import java.util.Random;

public class Pho extends Mon {
    int loai;
    String thit[];
    public Pho(String tenMon, String dvt, int gia, int soluong, int loai, String thit[]) {
        super(tenMon, dvt, gia, soluong);
        this.loai = loai;
        this.thit = thit;
    }

    public String toString() {
        String str = "";
        String loaito = "";
        Random ran = new Random();

        for(int i=0;i<=loai;i++)
            // str+=thit[i]+", ";
            {
                int w = ran.nextInt(0, 5);
                str+=thit[w]+", ";
            }
        if(loai==1)
            loaito = "to nho";
        else if(loai==2)
            loaito = "to lon";
        else if(loai==3)
            loaito = "to dac biet";
            
        return "\nmon: "+tenMon+", dvt: "+dvt+", gia: "+gia+", so luong: "+soluong+", loai: "+loaito+", mon thit: "+str;
    }
}
