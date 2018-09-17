package baitap1;
import java.util.Scanner;
 
public class Hinhchunhat {
    public double chieuDai;
    public double chieuRong;
    public double chuVi;
    public double dienTich;
    Scanner a = new Scanner(System.in);
     
//    public void nhap() {
//        do {
//            System.out.print("Nhap chieu dai ====> ");
//            chieuDai =  a.nextDouble();
//            System.out.print("Nhap chieu rong ====> ");
//            chieuRong =  a.nextDouble();
//        } while (chieuDai < chieuRong);
//    }
//     
    
    public double chuVical(double cdai, double crong) {
        chuVi = ((cdai + crong) * 2);
        return chuVi;
    }
     
    public double dienTichcal(double cdai, double crong) {
        dienTich = (cdai * crong);
        return dienTich;
    }
     
    public static void ketqua(double chuvi, double dientich) {
        System.out.println("Chu vi hinh chu nhat = " + chuvi);
        System.out.println("Dien tich hinh chu nhat = " + dientich);
    }
}