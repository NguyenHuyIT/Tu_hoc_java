package BaiTap;

import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tổng của x và y: ");
        float Tong = sc.nextFloat();
        System.out.print("Nhập vào hiệu của x và y: ");
        float Hieu = sc.nextFloat();
        float x, y;
        x = (Tong + Hieu) / 2;
        y = (Tong - Hieu) / 2;
        System.out.println("Giá trị x cần tìm là: " + x + "\nGiá trị y cần tìm là: " + y);
    }
}
