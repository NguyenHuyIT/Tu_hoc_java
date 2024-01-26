package BaiTap;

import java.util.Scanner;

public class BaiTap09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng cần biết quý: ");
        byte month = sc.nextByte();
        if (month <= 3) {
            System.out.println("Quý 1");
        } else if (month <= 6) {
            System.out.println("Quý 2");
        } else if (month <= 9) {
            System.out.println("Quý 3");
        } else if (month <= 12) {
            System.out.println("Quý 4");
        } else {
            System.out.println("Không có quý");
        }
    }
}
