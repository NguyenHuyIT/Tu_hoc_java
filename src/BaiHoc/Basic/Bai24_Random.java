package BaiHoc.Basic;

import java.util.Random;

public class Bai24_Random {
    public static void main(String[] args) {
        // Khởi tạo đối tượng ngẫu nhiên
        Random rd = new Random();
        //1. lấy ngẫu nhiên 1 số nguyên
        int soNguyen = rd.nextInt(-50, 51);
        System.out.println(soNguyen);
        //2. lấy ngẫu nhiên số thực
        double soThuc = rd.nextDouble(-100, 101);
        System.out.println(soThuc);
    }
}
