package TiemPho;
// import java.util.Random;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        java.sql.Time date = new java.sql.Time(millis);

        // Random ran = new Random();
        // int loai = ran.nextInt(1, 4);
        String[] thit = {"tai","bo","nam","gan","gau"};

        Mon mon1 = new Mon("trung", "cai", 10000, 10);
        Mon mon2 = new Mon("quay", "cai", 7000, 20);
        Pho pho1 = new Pho("pho", "to", 30000, 2, 4, thit);
        Mon[] mon = {mon1,mon2,pho1};
        
        HoaDon[] hd = new HoaDon[4]; 
        hd[0] = new HoaDon("1", mon, "tinh tien", "phuc vu", 10, date);
        hd[1] = new HoaDon("2", mon, "tinh tien", "phuc vu", 10, date);
        hd[2] = new HoaDon("3", mon, "tinh tien", "phuc vu", 10, date);
        hd[3] = new HoaDon("4", mon, "tinh tien", "phuc vu", 10, date);

        for(int i=0;i<hd.length;i++) {
            System.out.println(hd[i]);
        }



        // System.out.println(hd1);
        // System.out.println("Tong tien: "+hd1.tongTien());
    }
}
