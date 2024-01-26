import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 2 số dương a, b: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float S = a * b;
        float P = 2 * (a + b);
        System.out.println("Diện tích S = " + S + "\nChu vi P = " + P);
    }
}
