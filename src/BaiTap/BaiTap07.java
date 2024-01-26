package BaiTap;

import java.util.Scanner;

public class BaiTap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào thàng cần biết số ngày: ");
        int month = sc.nextInt();
        if (month == 2) {
            System.out.print("Mời nhập thêm năm của tháng 2: ");
            int year = sc.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Có 29 ngày");
            } else {
                System.out.println("Có 28 ngày");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Có 30 ngày");
        } else {
            System.out.println("Có 31 ngày");
        }

    }
}
