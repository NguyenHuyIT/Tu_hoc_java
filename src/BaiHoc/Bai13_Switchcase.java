package BaiHoc;

import java.util.Scanner;

public class Bai13_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào một số nguyên: ");
        int a = sc.nextInt();
        int div = a % 2;
        switch (div) {
            case 0:
                System.out.println("số chẵn");
                break;
            default:
                System.out.println("Số lẻ");
                break;
        }
    }
}
