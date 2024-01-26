package BaiHoc;

import java.util.Scanner;

public class Bai11_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 2 số nguyên: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Kiểm tra điều kiện
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        sc.close();
    }
}
