package BaiTap;

import java.util.Scanner;

public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều cao(m): ");
        float Chieucao = sc.nextFloat();
        System.out.print("Nhập vào cân nặng(kg): ");
        float Cannang = sc.nextFloat();
        float BMI = Cannang / (float) Math.pow(Chieucao, 2);
        if (BMI < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI < 35) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }
    }
}
