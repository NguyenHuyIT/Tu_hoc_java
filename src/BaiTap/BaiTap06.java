package BaiTap;

import java.util.Scanner;

public class BaiTap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào năm cần kiểm tra dương lịch: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Là năm nhuận");
        } else {
            System.out.println("không phải năm nhuận");
        }
    }
}
