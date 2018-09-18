package baitap1;
public class rectangle {
 
    public static void main(String[] args) {
    	Hinhchunhat r1 = new Hinhchunhat();
         
        // Nhap chieu dai va chieu rong hinh chu nhat
    	r1.nhap();
                 
        // tinh dien tich va chu vi hinh chu nhat
        double chuVi =  r1.chuVical(r1.chieuDai, r1.chieuRong);
        double dienTich =  r1.dienTichcal(r1.chieuDai, r1.chieuRong);
         
        // Hien thi ket qua
        Hinhchunhat.ketqua(chuVi, dienTich);
    }
 
}