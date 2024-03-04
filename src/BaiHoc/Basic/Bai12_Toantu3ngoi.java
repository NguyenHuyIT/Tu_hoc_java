package BaiHoc.Basic;

import java.util.Scanner;

public class Bai12_Toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "là số chẵn" : "là số lẻ";
        System.out.println("Số vừa nhập " + traloi);
    }
}
